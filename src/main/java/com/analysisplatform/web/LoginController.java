package com.analysisplatform.web;


import com.analysisplatform.annotation.JwtIgnore;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.interceptor.JwtParam;
import com.analysisplatform.interceptor.JwtUtils;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;

import com.analysisplatform.model.School;
import com.analysisplatform.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * 登录验证Controller
 */

@RestController
@RequestMapping("/Authentication")
public class LoginController {

    @Autowired
    private JwtParam jwtParam;
    @Resource
    private SchoolService schoolService;

    /** 登录*/
    /**加此注解, 请求不做token验证*/
    @PostMapping("/login")
    @JwtIgnore
    @NoRepeatSubmit
    public Result login(@RequestBody School sc) {
        System.out.println("username:"+sc.getUsername());
        System.out.println("password:"+sc.getPassword());
        School school=schoolService.findByUsername(sc.getUsername());
        if (sc.getPassword().equals(school.getPassword()))
        {
            String token=JwtUtils.createToken(school.getOriginId(),jwtParam);
            return ResultGenerator.genSuccessResult(token);
        }
        return ResultGenerator.genFailResult("登录时错误,稍后再试");
    }

}

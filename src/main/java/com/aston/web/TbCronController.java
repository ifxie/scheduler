package com.aston.web;

import com.aston.core.Result;
import com.aston.core.ResultGenerator;
import com.aston.model.TbCron;
import com.aston.service.TbCronService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zck
 */
@RestController
@RequestMapping("/tb/cron")
public class TbCronController {
    @Resource
    private TbCronService tbCronService;

    @PostMapping("/add")
    public Result add(TbCron tbCron) {
        tbCronService.save(tbCron);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TbCron tbCron) {
        tbCronService.update(tbCron);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TbCron tbCron = tbCronService.findById(id);
        return ResultGenerator.genSuccessResult(tbCron);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TbCron> list = tbCronService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

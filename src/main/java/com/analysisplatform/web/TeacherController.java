package com.analysisplatform.web;

import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Teacher;
import com.analysisplatform.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Teacher teacher,@RequestHeader String schoolId) {
        teacherService.saveNoRepeat(teacher);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Teacher> teachers,@RequestHeader String schoolId)
    {
        teacherService.saveNoRepeat(teachers,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

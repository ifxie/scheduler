package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Course;
import com.analysisplatform.service.CourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Course course,@RequestHeader String schoolId) {
        courseService.saveNoRepeat(course);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Course> courses,@RequestHeader String schoolId)
    {
        courseService.saveNoRepeat(courses,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Student;
import com.analysisplatform.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Student student,@RequestHeader String schoolId) {
        studentService.saveNoRepeat(student);
        return ResultGenerator.genSuccessResult();
    }
    /**添加多条记录*/
    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Student> students,@RequestHeader String schoolId)
    {
        studentService.saveNoRepeat(students,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Exam;
import com.analysisplatform.service.ExamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Resource
    private ExamService examService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Exam exam,@RequestHeader String schoolId) {
        examService.saveNoRepeat(exam);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Exam> exams,@RequestHeader String schoolId)
    {
        examService.saveNoRepeat(exams,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

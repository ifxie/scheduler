package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Subject;

import com.analysisplatform.service.SubjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Resource
    private SubjectService subjectService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Subject subject,@RequestHeader String schoolId) {
        subjectService.saveNoRepeat(subject);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Subject> subjects,@RequestHeader String schoolId)
    {
        subjectService.saveNoRepeat(subjects,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

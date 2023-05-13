package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Grade;
import com.analysisplatform.service.GradeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/grade")
public class GradeController {
    @Resource
    private GradeService gradeService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Grade grade,@RequestHeader String schoolId) {
        gradeService.saveNoRepeat(grade);
        return ResultGenerator.genSuccessResult();
    }
    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Grade> grades,@RequestHeader String schoolId)
    {
        gradeService.saveNoRepeat(grades,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

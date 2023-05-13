package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Term;
import com.analysisplatform.service.TermService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/term")
public class TermController {
    @Resource
    private TermService termService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Term term,@RequestHeader String schoolId) {
        termService.saveNoRepeat(term);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Term> terms,@RequestHeader String schoolId)
    {
        termService.saveNoRepeat(terms,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

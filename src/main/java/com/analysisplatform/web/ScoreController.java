package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Score;
import com.analysisplatform.service.ScoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/score")
public class ScoreController {
    @Resource
    private ScoreService scoreService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result add(@RequestBody Score score,@RequestHeader String schoolId) {
        scoreService.saveNoRepeat(score);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Score> scores,@RequestHeader String schoolId)
    {
        scoreService.saveNoRepeat(scores,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

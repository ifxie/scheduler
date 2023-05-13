package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Campus;
import com.analysisplatform.service.CampusService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/campus")
public class CampusController {
    @Resource
    private CampusService campusService;

    /**插入单条记录*/
    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Campus campus,@RequestHeader String schoolId) {
        campusService.saveNoRepeat(campus);
        return ResultGenerator.genSuccessResult();
    }

    /**插入多条记录*/
    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Campus> campuses,@RequestHeader String schoolId)
    {
        campusService.saveNoRepeat(campuses,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.DormitoryBuilding;
import com.analysisplatform.service.DormitoryBuildingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/dormitory/building")
public class DormitoryBuildingController {
    @Resource
    private DormitoryBuildingService dormitoryBuildingService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody DormitoryBuilding dormitoryBuilding,@RequestHeader String schoolId) {
        dormitoryBuildingService.saveNoRepeat(dormitoryBuilding);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<DormitoryBuilding> dormitoryBuildings,@RequestHeader String schoolId)
    {
        dormitoryBuildingService.saveNoRepeat(dormitoryBuildings,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Consumption;
import com.analysisplatform.service.ConsumptionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/consumption")
public class ConsumptionController {
    @Resource
    private ConsumptionService consumptionService;

    /**添加一笔消费记录*/
    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Consumption consumption,@RequestHeader String schoolId) {
        consumptionService.saveNoRepeat(consumption);
        return ResultGenerator.genSuccessResult();
    }

    /**添加多笔消费记录*/
    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Consumption> consumptions,@RequestHeader String schoolId)
    {
        consumptionService.saveNoRepeat(consumptions,schoolId);
        return ResultGenerator.genSuccessResult();
    }
//    /**按名字查找消费记录*/
//    @PostMapping("/findByName")
//    public Result findByName(@RequestParam String studentName)
//    {
//        List<Consumption> consumptions=consumptionService.findByName(studentName);
//        return ResultGenerator.genSuccessResult(consumptions);
//    }
//
}

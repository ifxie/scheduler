package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.Attendance;
import com.analysisplatform.service.AttendanceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;
    /**插入单条记录*/
    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody Attendance attendance,@RequestHeader String schoolId) {
        attendanceService.saveNoRepeat(attendance);
        return ResultGenerator.genSuccessResult();
    }

    /**插入多条记录*/
    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<Attendance> attendances,@RequestHeader String schoolId)
    {

        attendanceService.saveNoRepeat(attendances,schoolId);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/update")
//    public Result update(@RequestBody Attendance attendance) {
//        attendanceService.update(attendance);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        Attendance attendance = attendanceService.findById(id);
//        return ResultGenerator.genSuccessResult(attendance);
//    }
//
//    @PostMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
//        PageHelper.startPage(page, size);
//        List<Attendance> list = attendanceService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }
}

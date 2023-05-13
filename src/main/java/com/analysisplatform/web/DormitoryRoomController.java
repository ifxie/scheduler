package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.DormitoryRoom;
import com.analysisplatform.service.DormitoryRoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/dormitory/room")
public class DormitoryRoomController {
    @Resource
    private DormitoryRoomService dormitoryRoomService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody DormitoryRoom dormitoryRoom,@RequestHeader String schoolId) {
        dormitoryRoomService.saveNoRepeat(dormitoryRoom);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<DormitoryRoom> dormitoryRooms,@RequestHeader String schoolId)
    {
        dormitoryRoomService.saveNoRepeat(dormitoryRooms,schoolId);
        return ResultGenerator.genSuccessResult();
    }

}

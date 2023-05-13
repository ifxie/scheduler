package com.analysisplatform.web;
import com.analysisplatform.annotation.NoRepeatSubmit;
import com.analysisplatform.core.Result;
import com.analysisplatform.core.ResultGenerator;
import com.analysisplatform.model.ClassEntity;
import com.analysisplatform.service.ClassEntityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @author zck
*/
@RestController
@RequestMapping("/class/entity")
public class ClassEntityController {
    @Resource
    private ClassEntityService classEntityService;

    @PostMapping("/addOne")
    @NoRepeatSubmit
    public Result addOne(@RequestBody ClassEntity classEntity,@RequestHeader String schoolId) {
        classEntityService.saveNoRepeat(classEntity);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/addMany")
    @NoRepeatSubmit
    public Result addMany(@RequestBody List<ClassEntity> classEntities,@RequestHeader String schoolId)
    {
        classEntityService.saveNoRepeat(classEntities,schoolId);
        return ResultGenerator.genSuccessResult();
    }
}

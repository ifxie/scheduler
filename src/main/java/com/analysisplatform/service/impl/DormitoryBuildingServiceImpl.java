package com.analysisplatform.service.impl;

import com.analysisplatform.dao.DormitoryBuildingMapper;
import com.analysisplatform.model.DormitoryBuilding;
import com.analysisplatform.service.DormitoryBuildingService;
import com.analysisplatform.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zck
 */
@Service
@Transactional
public class DormitoryBuildingServiceImpl extends AbstractService<DormitoryBuilding> implements DormitoryBuildingService {
    @Resource
    private DormitoryBuildingMapper dormitoryBuildingMapper;


    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(DormitoryBuilding dormitoryBuilding)
    {
        List<DormitoryBuilding> dormitoryBuildings=new ArrayList<DormitoryBuilding>();
        dormitoryBuildings.add(dormitoryBuilding);
        dormitoryBuildingMapper.insertNoRepeat(dormitoryBuildings);
    }

    @Override
    public void saveNoRepeat(List<DormitoryBuilding> buildings, String schoolId)
    {
        dormitoryBuildingMapper.insertNoRepeat(buildings);
    }
}

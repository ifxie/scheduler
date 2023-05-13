package com.analysisplatform.service.impl;

import com.analysisplatform.dao.DormitoryRoomMapper;
import com.analysisplatform.model.DormitoryRoom;
import com.analysisplatform.service.DormitoryRoomService;
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
public class DormitoryRoomServiceImpl extends AbstractService<DormitoryRoom> implements DormitoryRoomService {
    @Resource
    private DormitoryRoomMapper dormitoryRoomMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(DormitoryRoom room)
    {
        List<DormitoryRoom> rooms=new ArrayList<DormitoryRoom>();
        rooms.add(room);
        dormitoryRoomMapper.insertNoRepeat(rooms);

    }

    @Override
    public void saveNoRepeat(List<DormitoryRoom> rooms, String schoolId)
    {
        dormitoryRoomMapper.insertNoRepeat(rooms);
    }
}

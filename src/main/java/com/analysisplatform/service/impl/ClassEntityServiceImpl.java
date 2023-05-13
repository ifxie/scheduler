package com.analysisplatform.service.impl;

import com.analysisplatform.dao.ClassEntityMapper;
import com.analysisplatform.model.ClassEntity;
import com.analysisplatform.service.ClassEntityService;
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
public class ClassEntityServiceImpl extends AbstractService<ClassEntity> implements ClassEntityService {
    @Resource
    private ClassEntityMapper classMapper;


    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(ClassEntity classEntity)
    {
        List<ClassEntity> classEntities=new ArrayList<ClassEntity>();
        classEntities.add(classEntity);
        classMapper.insertNoRepeat(classEntities);
    }

    @Override
    public void saveNoRepeat(List<ClassEntity> classEntities, String schoolId)
    {
        classMapper.insertNoRepeat(classEntities);
    }
}

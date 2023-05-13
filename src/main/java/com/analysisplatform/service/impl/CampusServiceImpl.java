package com.analysisplatform.service.impl;

import com.analysisplatform.dao.CampusMapper;
import com.analysisplatform.model.Campus;
import com.analysisplatform.service.CampusService;
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
public class CampusServiceImpl extends AbstractService<Campus> implements CampusService {
    @Resource
    private CampusMapper campusMapper;

    @Override
    public void saveNoRepeat(List<Campus> campuses, String schoolId)
    {
        List<String> oldData=campusMapper.findAllOriginIdBySchoolId(schoolId);
        List<Campus> updateData=new ArrayList<Campus>();
        List<Campus> insertData=new ArrayList<Campus>();

        /**数据筛选*/
        for(Campus campus:campuses)
        {
            if (oldData.contains(campus.getOriginId())) {
                /**如果存在相同的origin_Id旧数据*/
                updateData.add(campus);
            } else {
                /**不存在相同的origin_Id旧数据*/
                insertData.add(campus);
            }
        }

        /**怼部分进行更新*/
        for (Campus campus:updateData)
        {
            campusMapper.updateByOriginIdAndSchoolId(campus);
        }
        /**对部分进行插入
         *
         * 说明：insertList()存在一个小bug，
         * 就是List长度为1的时候，无法使用该函数
         * */
        if (insertData.size()==1)
        {
            campusMapper.insert(insertData.get(0));
        }else if (insertData.size()>1){

            campusMapper.insertList(insertData);
        }
    }
    @Override
    public void saveNoRepeat(Campus campus)
    {
        List<String> oldData=campusMapper.findAllOriginIdBySchoolId(campus.getOriginSchoolId());
        if (oldData.contains(campus.getOriginId()))
        {
            /**如果存在相同的origin_Id旧数据*/
            campusMapper.updateByOriginIdAndSchoolId(campus);
        }else
        {
            campusMapper.insert(campus);
        }
    }

    /**获取该学校的所有origin_Id
     * @Return List<String> 学生数列
     * */
    @Override
    public List<String> findAllOriginIdBySchool(String schoolId)
    {
        /**获得统一学校的所有originId,进行重复性验证*/
        List<String> checkRepeatCarriers=campusMapper.findAllOriginIdBySchoolId(schoolId);
        return checkRepeatCarriers;
    }

}

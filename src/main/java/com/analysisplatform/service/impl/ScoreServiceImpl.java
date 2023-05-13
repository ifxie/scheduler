package com.analysisplatform.service.impl;

import com.analysisplatform.dao.ScoreMapper;
import com.analysisplatform.model.Score;
import com.analysisplatform.service.ScoreService;
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
public class ScoreServiceImpl extends AbstractService<Score> implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Score score)
    {
        List<Score> scores=new ArrayList<Score>();
        scores.add(score);
        scoreMapper.insertNoRepeat(scores);
    }

    @Override
    public void saveNoRepeat(List<Score> scores, String schoolId)
    {
        scoreMapper.insertNoRepeat(scores);
    }
}

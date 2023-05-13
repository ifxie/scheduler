package com.analysisplatform.service.impl;

import com.analysisplatform.dao.TermMapper;
import com.analysisplatform.model.Term;
import com.analysisplatform.service.TermService;
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
public class TermServiceImpl extends AbstractService<Term> implements TermService {
    @Resource
    private TermMapper termMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Term term)
    {
        List<Term> terms=new ArrayList<Term>();
        terms.add(term);
        termMapper.insertNoRepeat(terms);
    }

    @Override
    public void saveNoRepeat(List<Term> terms, String schoolId)
    {
        termMapper.insertNoRepeat(terms);
    }
}

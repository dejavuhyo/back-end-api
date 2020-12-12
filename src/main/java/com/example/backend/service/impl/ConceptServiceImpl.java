package com.example.backend.service.impl;

import com.example.backend.mapper.ConceptMapper;
import com.example.backend.service.ConceptService;
import com.example.backend.vo.ConceptVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConceptServiceImpl implements ConceptService {

    @Resource
    ConceptMapper conceptMapper;

    @Override
    public List<ConceptVO> getConceptIdInfo(ConceptVO conceptVO) {
        return conceptMapper.getConceptIdInfo(conceptVO);
    }

}

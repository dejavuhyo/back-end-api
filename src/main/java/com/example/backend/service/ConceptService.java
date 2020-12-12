package com.example.backend.service;

import com.example.backend.vo.ConceptVO;

import java.util.List;

public interface ConceptService {

    List<ConceptVO> getConceptIdInfo(ConceptVO conceptVO);

}

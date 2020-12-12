package com.example.backend.mapper;

import com.example.backend.vo.ConceptVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConceptMapper {

    List<ConceptVO> getConceptIdInfo(ConceptVO conceptVO);
}

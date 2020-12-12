package com.example.backend.mapper;

import com.example.backend.vo.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VisitMapper {

    VisitVO conceptVisitCnt(VisitVO visitVO);

    VisitVO genderVisitCnt(VisitVO visitVO);

    VisitVO raceVisitCnt(VisitVO visitVO);

    VisitVO ethnicityVisitCnt(VisitVO visitVO);

    VisitVO ageVisitCnt(VisitVO visitVO);
}

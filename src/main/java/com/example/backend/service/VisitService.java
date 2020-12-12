package com.example.backend.service;

import com.example.backend.vo.*;

public interface VisitService {

    VisitVO conceptVisitCnt(VisitVO visitVO);

    VisitVO genderVisitCnt(VisitVO visitVO);

    VisitVO raceVisitCnt(VisitVO visitVO);

    VisitVO ethnicityVisitCnt(VisitVO visitVO);

    VisitVO ageVisitCnt(VisitVO visitVO);

}

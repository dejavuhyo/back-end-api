package com.example.backend.service.impl;

import com.example.backend.mapper.VisitMapper;
import com.example.backend.service.VisitService;
import com.example.backend.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VisitServiceImpl implements VisitService {

    @Resource
    VisitMapper visitMapper;

    @Override
    public VisitVO conceptVisitCnt(VisitVO visitVO) {
        return visitMapper.conceptVisitCnt(visitVO);
    }

    @Override
    public VisitVO genderVisitCnt(VisitVO visitVO) {
        return visitMapper.genderVisitCnt(visitVO);
    }

    @Override
    public VisitVO raceVisitCnt(VisitVO visitVO) {
        return visitMapper.raceVisitCnt(visitVO);
    }

    @Override
    public VisitVO ethnicityVisitCnt(VisitVO visitVO) {
        return visitMapper.ethnicityVisitCnt(visitVO);
    }

    @Override
    public VisitVO ageVisitCnt(VisitVO visitVO) {
        return visitMapper.ageVisitCnt(visitVO);
    }

}

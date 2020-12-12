package com.example.backend.service.impl;

import com.example.backend.mapper.PatientMapper;
import com.example.backend.service.PatientService;
import com.example.backend.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    PatientMapper statisticsMapper;

    @Override
    public TotalVO totalPatientCnt(TotalVO totalVO) {
        return statisticsMapper.totalPatientCnt(totalVO);
    }

    @Override
    public TotalVO genderPatientCnt(TotalVO totalVO) {
        return statisticsMapper.genderPatientCnt(totalVO);
    }

    @Override
    public TotalVO racePatientCnt(TotalVO totalVO) {
        return statisticsMapper.racePatientCnt(totalVO);
    }

    @Override
    public TotalVO ethnicityPatientCnt(TotalVO totalVO) {
        return statisticsMapper.ethnicityPatientCnt(totalVO);
    }

    @Override
    public TotalVO deathPatientCnt(TotalVO totalVO) {
        return statisticsMapper.deathPatientCnt(totalVO);
    }

}

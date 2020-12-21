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
    public PatientVO totalPatientCnt(PatientVO patientVO) {
        return statisticsMapper.totalPatientCnt(patientVO);
    }

    @Override
    public PatientVO genderPatientCnt(PatientVO patientVO) {
        return statisticsMapper.genderPatientCnt(patientVO);
    }

    @Override
    public PatientVO racePatientCnt(PatientVO patientVO) {
        return statisticsMapper.racePatientCnt(patientVO);
    }

    @Override
    public PatientVO ethnicityPatientCnt(PatientVO patientVO) {
        return statisticsMapper.ethnicityPatientCnt(patientVO);
    }

    @Override
    public PatientVO deathPatientCnt(PatientVO patientVO) {
        return statisticsMapper.deathPatientCnt(patientVO);
    }

}

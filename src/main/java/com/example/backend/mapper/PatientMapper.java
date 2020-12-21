package com.example.backend.mapper;

import com.example.backend.vo.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientMapper {

    PatientVO totalPatientCnt(PatientVO patientVO);

    PatientVO genderPatientCnt(PatientVO patientVO);

    PatientVO racePatientCnt(PatientVO patientVO);

    PatientVO ethnicityPatientCnt(PatientVO patientVO);

    PatientVO deathPatientCnt(PatientVO patientVO);
}

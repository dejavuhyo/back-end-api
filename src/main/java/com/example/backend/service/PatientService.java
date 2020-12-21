package com.example.backend.service;

import com.example.backend.vo.*;

public interface PatientService {

    PatientVO totalPatientCnt(PatientVO patientVO);

    PatientVO genderPatientCnt(PatientVO patientVO);

    PatientVO racePatientCnt(PatientVO patientVO);

    PatientVO ethnicityPatientCnt(PatientVO patientVO);

    PatientVO deathPatientCnt(PatientVO patientVO);
}

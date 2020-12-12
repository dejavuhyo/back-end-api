package com.example.backend.service;

import com.example.backend.vo.*;

public interface PatientService {

    TotalVO totalPatientCnt(TotalVO totalVO);

    TotalVO genderPatientCnt(TotalVO totalVO);

    TotalVO racePatientCnt(TotalVO totalVO);

    TotalVO ethnicityPatientCnt(TotalVO totalVO);

    TotalVO deathPatientCnt(TotalVO totalVO);
}

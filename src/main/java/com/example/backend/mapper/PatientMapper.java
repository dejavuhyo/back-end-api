package com.example.backend.mapper;

import com.example.backend.vo.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientMapper {

    TotalVO totalPatientCnt(TotalVO totalVO);

    TotalVO genderPatientCnt(TotalVO totalVO);

    TotalVO racePatientCnt(TotalVO totalVO);

    TotalVO ethnicityPatientCnt(TotalVO totalVO);

    TotalVO deathPatientCnt(TotalVO totalVO);
}

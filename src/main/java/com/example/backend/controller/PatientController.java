package com.example.backend.controller;

import com.example.backend.service.PatientService;
import com.example.backend.vo.*;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    /**
     * 타입별 환자 수
     * @param totalVO
     * @param cntType
     * @return
     */
    @GetMapping(value = "/getTotCnt")
    public @ResponseBody
    String getTotCnt(TotalVO totalVO, @RequestParam("cntType") String cntType) {

        JsonObject obj = new JsonObject();
        JsonObject data = new JsonObject();

        switch (cntType) {

            case "totalPatientCnt":
                totalVO = patientService.totalPatientCnt(totalVO);
                String totPatientCnt = totalVO.getTotalPatientCnt();

                obj.addProperty("title", "전체 환자수");
                data.addProperty("cnt", totPatientCnt);

                break;

            case "genderPatientCnt":
                totalVO = patientService.genderPatientCnt(totalVO);
                String maleCnt = totalVO.getMaleCnt();
                String femaleCnt = totalVO.getFemaleCnt();

                obj.addProperty("title", "성별 환자 수");
                data.addProperty("maleCnt", maleCnt);
                data.addProperty("femaleCnt", femaleCnt);

                break;

            case "racePatientCnt":
                totalVO = patientService.racePatientCnt(totalVO);
                String asianPatientCnt = totalVO.getAsianPatientCnt();
                String blackPatientCnt = totalVO.getBlackPatientCnt();
                String whitePatientCnt = totalVO.getWhitePatientCnt();
                String nativePatientCnt = totalVO.getNativePatientCnt();
                String otherPatientCnt = totalVO.getOtherPatientCnt();

                obj.addProperty("title", "인종별 환자 수");
                data.addProperty("asianPatientCnt", asianPatientCnt);
                data.addProperty("blackPatientCnt", blackPatientCnt);
                data.addProperty("whitePatientCnt", whitePatientCnt);
                data.addProperty("nativePatientCnt", nativePatientCnt);
                data.addProperty("otherPatientCnt", otherPatientCnt);

                break;

            case "ethnicityPatientCnt":
                totalVO = patientService.ethnicityPatientCnt(totalVO);
                String hispanicPatientCnt = totalVO.getHispanicPatientCnt();
                String nonhispanicPatientCnt = totalVO.getNonhispanicPatientCnt();

                obj.addProperty("title", "민족별 환자 수");
                data.addProperty("hispanicPatientCnt", hispanicPatientCnt);
                data.addProperty("nonhispanicPatientCnt", nonhispanicPatientCnt);

                break;

            case "deathPatientCnt":
                totalVO = patientService.deathPatientCnt(totalVO);
                String deathPatientCnt = totalVO.getDeathPatientCnt();

                obj.addProperty("title", "사망 환자 수");
                data.addProperty("deathPatientCnt", deathPatientCnt);

                break;

            default:
                obj.addProperty("title", "error");

                break;
        }

        obj.add("data", data);

        return obj.toString();
    }

}

package com.example.backend.controller;

import com.example.backend.service.PatientService;
import com.example.backend.vo.PatientVO;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    /**
     * 타입별 환자 수
     * @param patientVO
     * @param cntType
     * @return
     */
    @GetMapping(value = "/getTotCnt")
    public String getTotCnt(PatientVO patientVO, @RequestParam("cntType") String cntType) {

        JsonObject obj = new JsonObject();
        JsonObject data = new JsonObject();

        switch (cntType) {

            case "totalPatientCnt":
                patientVO = patientService.totalPatientCnt(patientVO);
                String totPatientCnt = patientVO.getTotalPatientCnt();

                obj.addProperty("title", "전체 환자수");
                data.addProperty("cnt", totPatientCnt);

                break;

            case "genderPatientCnt":
                patientVO = patientService.genderPatientCnt(patientVO);
                String maleCnt = patientVO.getMaleCnt();
                String femaleCnt = patientVO.getFemaleCnt();

                obj.addProperty("title", "성별 환자 수");
                data.addProperty("maleCnt", maleCnt);
                data.addProperty("femaleCnt", femaleCnt);

                break;

            case "racePatientCnt":
                patientVO = patientService.racePatientCnt(patientVO);
                String asianPatientCnt = patientVO.getAsianPatientCnt();
                String blackPatientCnt = patientVO.getBlackPatientCnt();
                String whitePatientCnt = patientVO.getWhitePatientCnt();
                String nativePatientCnt = patientVO.getNativePatientCnt();
                String otherPatientCnt = patientVO.getOtherPatientCnt();

                obj.addProperty("title", "인종별 환자 수");
                data.addProperty("asianPatientCnt", asianPatientCnt);
                data.addProperty("blackPatientCnt", blackPatientCnt);
                data.addProperty("whitePatientCnt", whitePatientCnt);
                data.addProperty("nativePatientCnt", nativePatientCnt);
                data.addProperty("otherPatientCnt", otherPatientCnt);

                break;

            case "ethnicityPatientCnt":
                patientVO = patientService.ethnicityPatientCnt(patientVO);
                String hispanicPatientCnt = patientVO.getHispanicPatientCnt();
                String nonhispanicPatientCnt = patientVO.getNonhispanicPatientCnt();

                obj.addProperty("title", "민족별 환자 수");
                data.addProperty("hispanicPatientCnt", hispanicPatientCnt);
                data.addProperty("nonhispanicPatientCnt", nonhispanicPatientCnt);

                break;

            case "deathPatientCnt":
                patientVO = patientService.deathPatientCnt(patientVO);
                String deathPatientCnt = patientVO.getDeathPatientCnt();

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

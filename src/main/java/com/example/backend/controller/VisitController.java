package com.example.backend.controller;

import com.example.backend.service.VisitService;
import com.example.backend.vo.VisitVO;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitController {

    @Autowired
    VisitService visitService;

    /**
     * 타입별 방문 수
     * @param visitVO
     * @param cntType
     * @return
     */
    @GetMapping(value = "/getVisitCnt")
    public String getVisitCnt(VisitVO visitVO, @RequestParam("cntType") String cntType) {

        JsonObject obj = new JsonObject();
        JsonObject data = new JsonObject();

        switch (cntType) {

            case "conceptVisitCnt":
                visitVO = visitService.conceptVisitCnt(visitVO);
                String inpatientVisit = visitVO.getInpatientVisit();
                String outpatientVisit = visitVO.getOutpatientVisit();
                String emergencyRoomVisit = visitVO.getEmergencyRoomVisit();

                obj.addProperty("title", "유형별 방문 수");
                data.addProperty("inpatientVisit", inpatientVisit);
                data.addProperty("outpatientVisit", outpatientVisit);
                data.addProperty("emergencyRoomVisit", emergencyRoomVisit);

                break;

            case "genderVisitCnt":
                visitVO = visitService.genderVisitCnt(visitVO);
                String maleVisitCnt = visitVO.getMaleVisitCnt();
                String femaleVisitCnt = visitVO.getFemaleVisitCnt();

                obj.addProperty("title", "성별 방문 수");
                data.addProperty("maleVisitCnt", maleVisitCnt);
                data.addProperty("femaleVisitCnt", femaleVisitCnt);

                break;

            case "raceVisitCnt":
                visitVO = visitService.raceVisitCnt(visitVO);
                String asianVisitCnt = visitVO.getAsianVisitCnt();
                String blackVisitCnt = visitVO.getBlackVisitCnt();
                String whiteVisitCnt = visitVO.getWhiteVisitCnt();
                String nativeVisitCnt = visitVO.getNativeVisitCnt();
                String otherVisitCnt = visitVO.getOtherVisitCnt();

                obj.addProperty("title", "인종별 방문 수");
                data.addProperty("asianVisitCnt", asianVisitCnt);
                data.addProperty("blackVisitCnt", blackVisitCnt);
                data.addProperty("whiteVisitCnt", whiteVisitCnt);
                data.addProperty("nativeVisitCnt", nativeVisitCnt);
                data.addProperty("otherVisitCnt", otherVisitCnt);

                break;

            case "ethnicityVisitCnt":
                visitVO = visitService.ethnicityVisitCnt(visitVO);
                String hispanicVisitCnt = visitVO.getHispanicVisitCnt();
                String nonhispanicVisitCnt = visitVO.getNonhispanicVisitCnt();

                obj.addProperty("title", "민족별 방문 수");
                data.addProperty("hispanicVisitCnt", hispanicVisitCnt);
                data.addProperty("nonhispanicVisitCnt", nonhispanicVisitCnt);

                break;

            case "ageVisitCnt":
                visitVO = visitService.ageVisitCnt(visitVO);
                String years00 = visitVO.getYears00();
                String years10 = visitVO.getYears10();
                String years20 = visitVO.getYears20();
                String years30 = visitVO.getYears30();
                String years40 = visitVO.getYears40();
                String years50 = visitVO.getYears50();
                String years60 = visitVO.getYears60();
                String years70 = visitVO.getYears70();
                String years80 = visitVO.getYears80();
                String years90 = visitVO.getYears90();

                obj.addProperty("title", "연령대별 방문 수");
                data.addProperty("years0_9", years00);
                data.addProperty("years10_19", years10);
                data.addProperty("years20_29", years20);
                data.addProperty("years30_39", years30);
                data.addProperty("years40_49", years40);
                data.addProperty("years50_59", years50);
                data.addProperty("years60_69", years60);
                data.addProperty("years70_79", years70);
                data.addProperty("years80_89", years80);
                data.addProperty("years90_99", years90);

                break;

            default:
                obj.addProperty("title", "error");

                break;
        }

        obj.add("data", data);

        return obj.toString();
    }

}

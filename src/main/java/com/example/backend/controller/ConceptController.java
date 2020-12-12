package com.example.backend.controller;

import com.example.backend.service.ConceptService;
import com.example.backend.vo.ConceptVO;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConceptController {

    @Autowired
    ConceptService conceptService;

    /**
     * concept_id 정보
     * @param conceptVO
     * @param searchKwd
     * @param searchCnd
     * @param viewCnt
     * @param pageCnt
     * @return
     */
    @GetMapping(value = "/getConceptIdInfo")
    public @ResponseBody
    String getConceptIdInfo(ConceptVO conceptVO, @RequestParam("searchKwd") String searchKwd, @RequestParam("searchCnd") String searchCnd, @RequestParam("viewCnt") int viewCnt, @RequestParam("pageCnt") int pageCnt) {

        conceptVO.setSearchKwd(searchKwd);
        // concept
        // condition
        // death
        // drug
        // person
        // visit
        conceptVO.setSearchCnd(searchCnd);
        conceptVO.setViewCnt(viewCnt);
        conceptVO.setPageCnt(pageCnt);

        JsonObject obj = new JsonObject();
        obj.addProperty("title", "concept_id 정보");

        List<ConceptVO> cenceptIdList = conceptService.getConceptIdInfo(conceptVO);

        JsonArray list = new JsonArray();
        for (ConceptVO vo : cenceptIdList) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("concept_id", vo.getConceptId());
            list.add(jsonObject);
        }
        obj.add("data", list);

        return obj.toString();
    }

}

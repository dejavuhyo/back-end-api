package com.example.backend.controller;

import com.example.backend.service.TableService;
import com.example.backend.vo.TableVO;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {

    @Autowired
    TableService tableService;

    /**
     * 테이블의 값
     * @param tableVO
     * @param searchKwd
     * @param viewCnt
     * @param pageNum
     * @return
     */
    @GetMapping(value = "/getTableVal")
    public String getTableVal(TableVO tableVO, @RequestParam("searchKwd") String searchKwd, @RequestParam("viewCnt") int viewCnt, @RequestParam("pageNum") int pageNum) {

        tableVO.setSearchKwd(searchKwd);
        tableVO.setViewCnt(viewCnt);
        tableVO.setPageNum(pageNum);

        List<TableVO> tableValList = tableService.getTableVal(tableVO);

        JsonObject obj = new JsonObject();
        obj.addProperty("title", "테이블의 값");

        JsonArray list = new JsonArray();
        for (TableVO vo : tableValList) {
            JsonObject jsonObject = new JsonObject();

            jsonObject.addProperty("concept_name", vo.getConceptName());
            jsonObject.addProperty("domain_id", vo.getDomainId());
            jsonObject.addProperty("vocabulary_id", vo.getVocabularyId());
            jsonObject.addProperty("concept_class_id", vo.getConceptClassId());
            jsonObject.addProperty("standard_concept", vo.getStandardConcept());
            jsonObject.addProperty("concept_code", vo.getConceptCode());
            jsonObject.addProperty("valid_start_date", vo.getValidStartDate());
            jsonObject.addProperty("valid_end_date", vo.getValidEndDate());
            jsonObject.addProperty("invalid_reason", vo.getInvalidReason());
            list.add(jsonObject);
        }
        obj.add("data", list);

        return obj.toString();
    }

}

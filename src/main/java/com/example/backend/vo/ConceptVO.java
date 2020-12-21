package com.example.backend.vo;

public class ConceptVO {

    private String searchKwd;
    private String searchCnd;
    private int viewCnt;
    private int pageNum;

    private String conceptId;

    public String getSearchKwd() {
        return searchKwd;
    }

    public void setSearchKwd(String searchKwd) {
        this.searchKwd = searchKwd;
    }

    public String getSearchCnd() {
        return searchCnd;
    }

    public void setSearchCnd(String searchCnd) {
        this.searchCnd = searchCnd;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getConceptId() {
        return conceptId;
    }

    public void setConceptId(String conceptId) {
        this.conceptId = conceptId;
    }
}

package com.example.backend.vo;

import com.google.gson.JsonElement;

public class TotalVO {

    private String totalPatientCnt;

    private String maleCnt;
    private String femaleCnt;

    private String asianPatientCnt;
    private String blackPatientCnt;
    private String whitePatientCnt;
    private String nativePatientCnt;
    private String otherPatientCnt;

    private String hispanicPatientCnt;
    private String nonhispanicPatientCnt;

    private String deathPatientCnt;

    public String getTotalPatientCnt() {
        return totalPatientCnt;
    }

    public void setTotalPatientCnt(String totalPatientCnt) {
        this.totalPatientCnt = totalPatientCnt;
    }

    public String getMaleCnt() {
        return maleCnt;
    }

    public void setMaleCnt(String maleCnt) {
        this.maleCnt = maleCnt;
    }

    public String getFemaleCnt() {
        return femaleCnt;
    }

    public void setFemaleCnt(String femaleCnt) {
        this.femaleCnt = femaleCnt;
    }

    public String getAsianPatientCnt() {
        return asianPatientCnt;
    }

    public void setAsianPatientCnt(String asianPatientCnt) {
        this.asianPatientCnt = asianPatientCnt;
    }

    public String getBlackPatientCnt() {
        return blackPatientCnt;
    }

    public void setBlackPatientCnt(String blackPatientCnt) {
        this.blackPatientCnt = blackPatientCnt;
    }

    public String getWhitePatientCnt() {
        return whitePatientCnt;
    }

    public void setWhitePatientCnt(String whitePatientCnt) {
        this.whitePatientCnt = whitePatientCnt;
    }

    public String getNativePatientCnt() {
        return nativePatientCnt;
    }

    public void setNativePatientCnt(String nativePatientCnt) {
        this.nativePatientCnt = nativePatientCnt;
    }

    public String getOtherPatientCnt() {
        return otherPatientCnt;
    }

    public void setOtherPatientCnt(String otherPatientCnt) {
        this.otherPatientCnt = otherPatientCnt;
    }

    public String getHispanicPatientCnt() {
        return hispanicPatientCnt;
    }

    public void setHispanicPatientCnt(String hispanicPatientCnt) {
        this.hispanicPatientCnt = hispanicPatientCnt;
    }

    public String getNonhispanicPatientCnt() {
        return nonhispanicPatientCnt;
    }

    public void setNonhispanicPatientCnt(String nonhispanicPatientCnt) {
        this.nonhispanicPatientCnt = nonhispanicPatientCnt;
    }

    public String getDeathPatientCnt() {
        return deathPatientCnt;
    }

    public void setDeathPatientCnt(String deathPatientCnt) {
        this.deathPatientCnt = deathPatientCnt;
    }
}

# back-end-api

## 1. 개발환경

* PostgreSQL v12.5

* zulu v11.43

## 2. DB 스크립트
<https://github.com/dejavuhyo/back-end/tree/main/db>

## 3. API 실행

### 1) 환자

* 전체 환자수
  - http://localhost:8080/getTotCnt?cntType=totalPatientCnt

* 성별 환자 수
  - http://localhost:8080/getTotCnt?cntType=genderPatientCnt

* 인종별 환자 수
  - http://localhost:8080/getTotCnt?cntType=racePatientCnt

* 민족별 환자 수
  - http://localhost:8080/getTotCnt?cntType=ethnicityPatientCntethnicityPatientCnt

* 사망 환자 수
  - http://localhost:8080/getTotCnt?cntType=deathPatientCnt

### 2) 방문

* 방문 유형(입원/외래/응급)별 방문 수
  - http://localhost:8080/getVisitCnt?cntType=conceptVisitCnt

* 성별 방문 수
  - http://localhost:8080/getVisitCnt?cntType=genderVisitCnt

* 인종별 방문 수
  - http://localhost:8080/getVisitCnt?cntType=raceVisitCnt

* 민족별 방문 수
  - http://localhost:8080/getVisitCnt?cntType=ethnicityVisitCnt

* 연령대별 방문 수
  - http://localhost:8080/getVisitCnt?cntType=ageVisitCnt

### 3) concept_id 정보

* http://localhost:8080/getConceptIdInfo?searchKwd=92&searchCnd=visit&viewCnt=10&pageCnt=1

* searchCnd 종류
  - concept: concept 테이블
  - condition: condition_occurrence 테이블
  - death: death 테이블
  - drug: drug_exposure 테이블
  - person: person 테이블
  - visit: visit_occurrence 테이블

### 4) 테이블의 값

* http://localhost:8080/getTableVal?searchKwd=capsule&viewCnt=10&pageCnt=1

## 4. DB 설정

* PK, FK 설정


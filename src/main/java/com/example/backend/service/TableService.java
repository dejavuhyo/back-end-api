package com.example.backend.service;

import com.example.backend.vo.TableVO;

import java.util.List;

public interface TableService {

    List<TableVO> getTableVal(TableVO tableVO);

}

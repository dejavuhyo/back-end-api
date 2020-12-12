package com.example.backend.service.impl;

import com.example.backend.mapper.TableMapper;
import com.example.backend.service.TableService;
import com.example.backend.vo.TableVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Resource
    TableMapper tableMapper;

    @Override
    public List<TableVO> getTableVal(TableVO tableVO) {
        return tableMapper.getTableVal(tableVO);
    }

}

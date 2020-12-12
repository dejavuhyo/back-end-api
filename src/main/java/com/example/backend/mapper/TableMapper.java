package com.example.backend.mapper;

import com.example.backend.vo.TableVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TableMapper {

    List<TableVO> getTableVal(TableVO tableVO);
}

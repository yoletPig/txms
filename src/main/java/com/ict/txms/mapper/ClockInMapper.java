package com.ict.txms.mapper;

import com.ict.txms.model.ClockIn;

public interface ClockInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClockIn record);

    int insertSelective(ClockIn record);

    ClockIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClockIn record);

    int updateByPrimaryKey(ClockIn record);
}
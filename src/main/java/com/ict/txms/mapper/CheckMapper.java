package com.ict.txms.mapper;

import com.ict.txms.model.Check;

public interface CheckMapper {
    int insert(Check record);

    int insertSelective(Check record);
}
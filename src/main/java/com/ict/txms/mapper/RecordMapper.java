package com.ict.txms.mapper;

import com.ict.txms.model.Record;

public interface RecordMapper {
    int insert(Record record);

    int insertSelective(Record record);
}
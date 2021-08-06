package com.privoce.youtube_sphere_record.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.privoce.youtube_sphere_record.entity.Record;
import com.privoce.youtube_sphere_record.mapper.RecordMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class RecordService {
    @Autowired
    private RecordMapper recordMapper;

    public List<Record> getRecordsById(String userId) {
        return recordMapper.queryRecordsById(userId);
    }
    public void createRecord(Record record) {
        recordMapper.insertRecord(record);
    }
    public void cancelRecord(Integer recordId) {
        recordMapper.cancelRecord(recordId);
    }
}

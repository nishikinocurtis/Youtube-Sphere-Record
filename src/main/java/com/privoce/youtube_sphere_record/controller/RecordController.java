package com.privoce.youtube_sphere_record.controller;

import com.privoce.youtube_sphere_record.service.RecordService;
import com.privoce.youtube_sphere_record.mapper.RecordMapper;
import com.privoce.youtube_sphere_record.entity.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping
    public String init() {
        return "page init";
    }

    @GetMapping( "/records")
    public List<Record> getRecords(@RequestParam(name = "userId") String userId) {
        System.out.println("get records request");
        return recordService.getRecordsById(userId);
    }
}

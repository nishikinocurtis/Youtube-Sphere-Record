package com.privoce.youtube_sphere_record;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.privoce.youtube_sphere_record.mapper")
public class YoutubeSphereRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubeSphereRecordApplication.class, args);
    }

}

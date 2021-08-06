package com.privoce.youtube_sphere_record.mapper;

import java.util.List;

import com.privoce.youtube_sphere_record.entity.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordMapper {
    @Select("SELECT userId, url, reaction, timeStamp, dateTime, keepPrivate FROM reactionRecords")
    @Results({
            @Result(property = "userId", column = "userId"),
            @Result(property = "url", column = "url"),
            @Result(property = "reaction", column = "reaction"),
            @Result(property = "timeStamp", column = "timeStamp"),
            @Result(property = "dateTime", column = "dateTime"),
            @Result(property = "keepPrivate", column = "keepPrivate")
    })
    List<Record> queryRecords();

    @Select("SELECT userId, url, reaction, timeStamp, dateTime, keepPrivate FROM reactionRecords " +
            "where userId = #{userId}")
    @Results({
            @Result(property = "userId", column = "userId"),
            @Result(property = "url", column = "url"),
            @Result(property = "reaction", column = "reaction"),
            @Result(property = "timeStamp", column = "timeStamp"),
            @Result(property = "dateTime", column = "dateTime"),
            @Result(property = "keepPrivate", column = "keepPrivate")
    })
    List<Record> queryRecordsById(String userId);

    @Insert("INSERT INTO reactionRecords(userId, url, reaction, timeStamp, dateTime, keepPrivate) " +
            "VALUES (#{userId}, #{url}, #{reaction}, #{timeStamp}, #{dateTime}, #{keepPrivate})")
    void insertRecord(Record record);

    @Update("UPDATE reactionRecords SET keepPrivate = #{state} WHERE recordId = #{recordId}")
    void flipPrivate(Integer recordId, Integer state);

    @Delete("DELETE FROM reactionRecords WHERE recordId=#{recordId}")
    void cancelRecord(Integer recordId);
}

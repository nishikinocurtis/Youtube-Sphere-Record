package com.privoce.youtube_sphere_record.entity;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Record {
    String userId, url, reaction;
    Integer timeStamp, dateTime, keepPrivate;

    public Record(String userId, String url, String reaction,
                  Integer timeStamp, Integer dateTime, Integer keepPrivate) {
        super();
        this.userId = userId;
        this.url = url;
        this.reaction = reaction;
        this.timeStamp = timeStamp;
        this.dateTime = dateTime;
        this.keepPrivate = keepPrivate;
    }

    public Record(String userId, String url, String reaction,
                  Integer timeStamp, Integer dateTime) {
        this(userId, url, reaction, timeStamp, dateTime, 0);
    }
}

package com.project.sns.model;

import com.project.sns.model.entity.AlarmEntity;
import com.project.sns.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;


@Getter
@AllArgsConstructor
public class Alarm {

    private Integer id;

    private User user;

    private AlarmType alarmType;

    private AlarmArgs args;

    private Timestamp registeredAt;

    private Timestamp updatedAt;

    private Timestamp deletedAt;

    public static Alarm fromEntity(AlarmEntity entity) {
        return new Alarm(
            entity.getId(),
            User.fromEntity(entity.getUser()),
            entity.getAlarmType(),
            entity.getArgs(),
            entity.getRegisteredAt(),
            entity.getUpdatedAt(),
            entity.getDeletedAt()
        );
    }
}

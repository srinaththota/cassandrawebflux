package com.cassandra.cassandrawebflux.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@PrimaryKeyClass
public class ChatKey implements Serializable {

    @PrimaryKeyColumn(name="from_user", ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private String fromUser;
    @PrimaryKeyColumn(name="to_user", ordinal = 1,type = PrimaryKeyType.PARTITIONED)
    private String toUser;
    @PrimaryKeyColumn(name="chatted_time", ordinal = 2,ordering = Ordering.DESCENDING)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime chattedTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatKey chatKey = (ChatKey) o;
        return Objects.equals(fromUser, chatKey.fromUser) && Objects.equals(toUser, chatKey.toUser) && Objects.equals(chattedTime, chatKey.chattedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromUser, toUser, chattedTime);
    }

    public ChatKey() {
    }

    public ChatKey(String fromUser, String toUser, LocalDateTime chattedTime) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.chattedTime = chattedTime;
    }

}

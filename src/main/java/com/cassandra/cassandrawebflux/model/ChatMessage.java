package com.cassandra.cassandrawebflux.model;

import org.springframework.data.annotation.Version;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("chat_message")
public class ChatMessage {
    @PrimaryKey
    private ChatKey chatKey;

    public ChatKey getChatKey() {
        return chatKey;
    }

    public void setChatKey(ChatKey chatKey) {
        this.chatKey = chatKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageGroup() {
        return messageGroup;
    }

    public void setMessageGroup(String messageGroup) {
        this.messageGroup = messageGroup;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Column("message")
    private String message;

    @Column("message_group")
    private String messageGroup;

    @Column("language")
    private String language;

    @Version
    @Column("version")
    private Integer version;


}

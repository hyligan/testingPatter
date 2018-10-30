package com.viber;

public class ReceiveMessage {

    private String event;
    private long message_token;
    private Boolean silent;
    private long timestamp;
    private String viber_token;
    private MessageEntity message;
    private SenderEntity sender;

    public ReceiveMessage(String event, long message_token, Boolean silent, long timestamp, String viber_token, MessageEntity message, SenderEntity sender) {
        this.event = event;
        this.message_token = message_token;
        this.silent = silent;
        this.timestamp = timestamp;
        this.viber_token = viber_token;
        this.message = message;
        this.sender = sender;
    }

    public ReceiveMessage() {
    }

    public MessageEntity getMessage() {
        return message;
    }

    public void setMessage(MessageEntity message) {
        this.message = message;
    }

    public SenderEntity getSender() {
        return sender;
    }

    public void setSender(SenderEntity sender) {
        this.sender = sender;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public long getMessage_token() {
        return message_token;
    }

    public void setMessage_token(long message_token) {
        this.message_token = message_token;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getViber_token() {
        return viber_token;
    }

    public void setViber_token(String viber_token) {
        this.viber_token = viber_token;
    }
}




class MessageEntity {
    private String text;
    private String type;

    public MessageEntity(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public MessageEntity() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class SenderEntity {
    private String id;
    private String avatar;
    private String language;
    private String country;
    private int api_version;

    public SenderEntity(String id, String avatar, String language, String country, int api_version) {
        this.id = id;
        this.avatar = avatar;
        this.language = language;
        this.country = country;
        this.api_version = api_version;
    }

    public SenderEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getApi_version() {
        return api_version;
    }

    public void setApi_version(int api_version) {
        this.api_version = api_version;
    }
}
package com.telegram;

public class ReceiveMessage {

    private MessageEntity message;
    private long update_id;

    public ReceiveMessage(MessageEntity message, long update_id) {
        this.message = message;
        this.update_id = update_id;
    }

    public ReceiveMessage() {
    }

    public MessageEntity getMessage() {
        return message;
    }

    public void setMessage(MessageEntity message) {
        this.message = message;
    }

    public long getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(long update_id) {
        this.update_id = update_id;
    }
}




class MessageEntity {
    private long message_id;
    private long date;
    private String text;
    private FromEntity from;
    private ChatEntity chat;

    public MessageEntity(long message_id, long date, String text) {
        this.message_id = message_id;
        this.date = date;
        this.text = text;
    }

    public MessageEntity() {

    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class FromEntity {
    private long id;
    private boolean is_bot;
    private String first_name;
    private String last_name;
    private String language_code;

    public FromEntity(long id, boolean is_bot, String first_name, String last_name, String language_code) {
        this.id = id;
        this.is_bot = is_bot;
        this.first_name = first_name;
        this.last_name = last_name;
        this.language_code = language_code;
    }

    public FromEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public void setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }
}

class ChatEntity {
    private long id;
    private String first_name;
    private String last_name;
    private String type;

    public ChatEntity(long id, String first_name, String last_name, String type) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.type = type;
    }

    public ChatEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
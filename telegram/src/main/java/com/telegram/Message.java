package com.telegram;

public class Message {

    private long chat_id;
    private String text;

    public Message(long chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }
}

package com.viber;

public class Message {

    private String receiver;
    private Sender sender;
    private String type;
    private String text;

    public Message(String name, String receiver, String type, String text) {
        Sender sender = new Sender(name);
        this.receiver = receiver;
        this.sender = sender;
        this.type = type;
        this.text = text;
    }
}

class Sender {
    private String name;

    public Sender(String name) {
        this.name = name;
    }
}



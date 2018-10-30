package com.viber;

import java.io.IOException;

public class Main {

    private  static final String token = "4898ee1bd1e7d7c0-a568a14bda665a17-46102d0b50119dde" ;
    private  static final String url = "https://chatapi.viber.com/pa/send_message?X-Viber-Auth-Token="+ token ;

    public static void main(String[] args) throws IOException {
        String text = "Koleno";

        Message message = new Message("Nika","94WOZvIvqzii0NiTUwXg3A==","text", text);
        SendPostRequest sendPostRequest = new SendPostRequest();

        sendPostRequest.sendRequest(url,message,token);
    }
}

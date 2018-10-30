package com.telegram;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String token = "607746019:AAHXXdbkXzspsCB5cD7AqGjcwug2_J4zuJs";
    private static final String url = "https://api.telegram.org/bot"+ token +"/sendMessage";


    public static void main(String[] args) throws IOException {

        boolean flag = true;

        do {
            System.out.print("Введите текст: ");

            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            if(!text.equals("exit")) {
                Message message = new Message(279295357, text);
                SendPostRequest sendPostRequest = new SendPostRequest();

                sendPostRequest.sendRequest(url, message);
            }else {
                flag=false;
            }
        } while (flag );

    }
}

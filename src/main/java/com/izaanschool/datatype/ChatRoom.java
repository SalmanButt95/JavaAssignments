package com.izaanschool.datatype;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Izaan School Chat Room!", participants = "Salman Butt, John, Joe, Harry, Lewis", messages = "Hello!";



        System.out.print("Enter the name of the chat room: " );
        name = scanner.nextLine();

        System.out.print("Enter the participants of the chat room: " );
        participants = scanner.nextLine();

        System.out.print("Enter the messages in the chat room: " );
        messages = scanner.nextLine();


        System.out.println("Chat Room Name: " + name);
        System.out.println("Participants: " + participants);
        System.out.println("Messages: " + messages);
    }
}

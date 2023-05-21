package com.izaanschool.ifelse;

public class ChatRoom {
    private String name;
    private int participants;
    private int messages;

    public ChatRoom(String name, int participants, int messages) {
        this.name = name;
        this.participants = participants;
        this.messages = messages;
    }

    public void info() {
        if (name.equals("Java Chat Room")) {
            System.out.println("Hi, Welcome to the Java Chat Room!\n");
        }
        System.out.println("Chat Room Name: " + name);
        System.out.println("Number of Participants: " + participants);
        System.out.println("Number of Messages: " + messages);
    }

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom("Java Chat Room", 16, 58);
        chatRoom.info();
    }
}

package com.izaanschool.methodcreation;

public class ChatRoom {
    private String name;
    private String participants;
    private String messages;

    public String getName() {
        return name;
    }

    public String getParticipants() {
        return participants;
    }

    public String getMessages() {
        return messages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        chatRoom.setName("Chat Room");
        chatRoom.setParticipants("Salman1, Salman2, Salman3");
        chatRoom.setMessages("Hello, How are you?, I'm good");

        System.out.println("Chat Room Details");
        System.out.println("Name: " + chatRoom.getName());
        System.out.println("Participants: " + chatRoom.getParticipants());
        System.out.println("Messages: " + chatRoom.getMessages());
    }
}

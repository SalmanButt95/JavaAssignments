package com.izaanschool.objects;
import java.util.ArrayList;
import java.util.List;

class ChatRoom {
    private String name;
    private List<String> participants;
    private List<String> messages;

    public ChatRoom(String name, List<String> participants, List<String> messages) {
        this.name = name;
        this.participants = participants;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public List<String> getMessages() {
        return messages;
    }

    public static void main(String[] args) {
        List<String> participants = new ArrayList<>();
        participants.add("Salman1");
        participants.add("Salman2");

        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("How are you?");

        ChatRoom chatRoom = new ChatRoom("Chat Room", participants, messages);

        String name = chatRoom.getName();
        List<String> chatParticipants = chatRoom.getParticipants();
        List<String> chatMessages = chatRoom.getMessages();

        System.out.println("Chat Room Name: " + name);
        System.out.println("Participants: " + chatParticipants);
        System.out.println("Messages: " + chatMessages);
    }
}

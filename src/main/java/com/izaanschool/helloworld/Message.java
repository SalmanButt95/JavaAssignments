package com.izaanschool.helloworld;
public class Message {
    private String sender;
    private String receiver;
    private String content;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Create a new instance of the Message class
        Message msg = new Message("Alice", "Bob", "Hello, Bob!");

        // Print out information about the message
        System.out.println("Message:");
        System.out.println("  Sender: " + msg.getSender());
        System.out.println("  Receiver: " + msg.getReceiver());
        System.out.println("  Content: " + msg.getContent());
    }
}

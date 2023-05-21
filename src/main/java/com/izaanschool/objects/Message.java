package com.izaanschool.objects;
import java.util.Date;
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
        // Create an object instance of the class
        Message message = new Message("Salman", "Salman1", "Hello, how are you?");

        // Access the object's properties
        String sender = message.getSender();
        String receiver = message.getReceiver();
        String content = message.getContent();

        // Print the object's properties
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Content: " + content);
    }
}

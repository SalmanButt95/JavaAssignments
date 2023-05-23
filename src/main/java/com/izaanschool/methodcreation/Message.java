package com.izaanschool.methodcreation;
import java.util.Date;
public class Message {
    private String sender;
    private String receiver;
    private String content;
    private Date timestamp;

    // Getters and setters methods for the properties
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public static void main(String[] args) {
        Message message = new Message();
        message.setSender("Salman1");
        message.setReceiver("Salman2");
        message.setContent("Hello, how are you?");


        Date timestamp = new Date();
        message.setTimestamp(timestamp);

        System.out.println("Sender: " + message.getSender());
        System.out.println("Receiver: " + message.getReceiver());
        System.out.println("Content: " + message.getContent());
        System.out.println("Timestamp: " + message.getTimestamp());
    }
}

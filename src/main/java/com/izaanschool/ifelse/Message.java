package com.izaanschool.ifelse;

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

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public static void main(String[] args) {
        String sender = "Salman";
        String receiver = "Bob";
        String messageContent = "Hello, Bob!";

        Message message = new Message(sender, receiver, messageContent);

        System.out.println("Sender: " + message.getSender());
        System.out.println("Receiver: " + message.getReceiver());
        System.out.println("Content: " + message.getContent());

        if (sender.equals("Salman")) {
            System.out.println("You can send the message: " + message.getContent());
        } else {
            System.out.println("Check connection, unable to send the message.");
        }
    }
}

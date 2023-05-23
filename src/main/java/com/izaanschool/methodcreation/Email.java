package com.izaanschool.methodcreation;

public class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    // Getter methods
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    // Setter methods
    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static void main(String[] args) {
        Email email = new Email();

        email.setSender("Salman@example.com");
        email.setRecipient("SalmanFriend@example.com");
        email.setSubject("Hello");
        email.setBody("How are you Salman's Friend?");

        System.out.println("Email Details");
        System.out.println("Sender: " + email.getSender());
        System.out.println("Recipient: " + email.getRecipient());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getBody());
    }
}

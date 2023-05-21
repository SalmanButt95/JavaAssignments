package com.izaanschool.objects;

public class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    public Email(String sender, String recipient, String subject, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static void main(String[] args) {
        Email email = new Email("thisissender@example.com", "thisistherecipient@example.com", "Hello, this is the subject", "And this is the body of the email.");

        String sender = email.getSender();
        String recipient = email.getRecipient();
        String subject = email.getSubject();
        String body = email.getBody();

        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}

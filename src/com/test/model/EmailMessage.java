package com.test.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import javax.mail.Message;
import java.util.Date;

public class EmailMessage {
    private SimpleStringProperty subject;
    private SimpleStringProperty sender;
    private SimpleStringProperty recipient;
    private SimpleIntegerProperty size;
    private SimpleObjectProperty<Date> date;
    private boolean isRead;
    private Message message;

    public EmailMessage(String subject, String sender, String recipient, int size, Date date, boolean isRead, Message message){
        this.subject = new SimpleStringProperty(subject);
        this.sender = new SimpleStringProperty(sender);
        this.recipient = new SimpleStringProperty(recipient);
        this.size = new SimpleIntegerProperty(size);
        this.date = new SimpleObjectProperty<>(date);
        this.isRead = isRead;
        this.message = message;
    }

    public String getSubject(){
        return this.subject.getName();
    }

    public String getSender(){
        return this.sender.getName();
    }

    public String getRecipient(){
        return this.recipient.getName();
    }

    public Integer getSize(){
        return this.size.getValue();
    }

    public Date getDate(){
        return this.date.getValue();
    }

    public boolean isRead(){
        return isRead;
    }

    public void setRead(boolean read){
        isRead = read;
    }
    public Message getMessage(){
        return this.message;
    }
}

module JavaFxEmailClientCourse {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.emailapp;
    opens com.emailapp.view;
    opens com.emailapp.controller;
    opens com.emailapp.model;

}
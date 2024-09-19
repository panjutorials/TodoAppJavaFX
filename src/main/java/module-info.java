module eu.tutorials.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;

    opens eu.tutorials.todoapp.controller to javafx.fxml;
    exports eu.tutorials.todoapp;
}
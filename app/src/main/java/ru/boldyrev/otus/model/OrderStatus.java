package ru.boldyrev.otus.model;


import lombok.Getter;

@Getter
public enum OrderStatus {
    NEW("New", "N"),
    IN_PROGRESS("In Progress", "IP"),
    COMPLETED("Completed", "C"),
    CANCELED("Canceled", "X");

    private final String jStatus;

    private final String dbStatus;

    OrderStatus(String jStatus, String dbStatus) {
        this.jStatus = jStatus;
        this.dbStatus = dbStatus;
    }


}


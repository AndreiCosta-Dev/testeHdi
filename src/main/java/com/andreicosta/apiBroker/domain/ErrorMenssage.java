package com.andreicosta.apiBroker.domain;

import java.util.Date;

public class ErrorMenssage {
    private Date currentDate;
    private String message;

    public ErrorMenssage(Date currentDate, String message) {
        this.currentDate = currentDate;
        this.message = message;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

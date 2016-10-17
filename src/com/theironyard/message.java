package com.theironyard;

import java.security.Timestamp;

/**
 * Created by vajrayogini on 10/17/16.
 */
public class message {
    int id;
    String author;
    String text;
    Timestamp time;

    public message(int id, String author, String text, Timestamp time) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}

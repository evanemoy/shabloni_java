package com.example.project14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Post{
    private String text;
    private String creationDate;
    private int id;
    private int count = 0;

    public int getId() {
        return id;
    }

    public Post(String text, String creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = count++;
    }

    public Post() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}

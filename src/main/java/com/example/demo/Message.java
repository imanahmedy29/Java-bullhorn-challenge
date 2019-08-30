package com.example.demo;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 1, max=30000)
    private String content;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date posteddate;

    @NotNull
    @Size(min = 2)
    private String sentby;

    @NotNull
    @Size(min = 2, max=50)
    private String title;

    private String image;

    public Message(@NotNull @Size(min = 1, max = 30000) String content, Date posteddate, @NotNull @Size(min = 2) String sentby, @NotNull @Size(min = 2, max = 50) String title, String image) {
        this.content = content;
        this.posteddate = posteddate;
        this.sentby = sentby;
        this.title = title;
        this.image = image;
    }

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(Date posteddate) {
        this.posteddate = posteddate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

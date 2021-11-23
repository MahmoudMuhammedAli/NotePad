package com.example.notepad;

import android.graphics.Bitmap;
import android.widget.TextView;

import java.io.Serializable;

public class Note implements Serializable {
    private String title;
    private String body;
    private String url;
    private Bitmap imagebitmap;

    public Note(String title, String body, String url, Bitmap imagebitmap) {
        this.title = title;
        this.body = body;
        this.url = url;
        this.imagebitmap = imagebitmap;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImagebitmap(Bitmap imagebitmap) {
        this.imagebitmap = imagebitmap;
    }

    public String getUrl() {
        return url;
    }

    public Bitmap getImagebitmap() {
        return imagebitmap;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
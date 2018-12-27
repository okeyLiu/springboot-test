package com.okliu.springboot.entity;
/*
 * 
 * 这是一个好东西
 * 111111
 * 
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
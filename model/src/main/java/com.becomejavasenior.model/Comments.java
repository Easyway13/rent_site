package com.becomejavasenior.model;

/**
 * Created by Ghost on 06.07.2016.
 */
public class Comments {
    private int id;
    private String date;
    private String text;
    private int rate;

    public Comments(){

    }

    public Comments(int id){
        this.id = id;
    }
    // Setters and getters for variables
    public void setText(String text){this.text = text;}
    public void setRate(int rate){this.rate = rate;}

    public String getDate(){return date;}
    public String getText(){return text;};
    public int rate(){return rate;}
}

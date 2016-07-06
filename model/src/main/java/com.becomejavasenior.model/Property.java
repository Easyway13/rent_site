package com.becomejavasenior.model;

/**
 * Created by Ghost on 01.07.2016.
 */
public class Property {
    private int id;
    private String city;
    private String address;
    private String photo;
    private String description;
    private int rooms_number;
    private int beds_number;
    private boolean parking;
    private boolean wi_fi;
    private boolean tv;
    //private timestamp avail_period;


    public Property (){

    }

    public Property(int id){
        this.id = id;
    }

    // Setters and getters for variables
    public void setCity(String city){this.city = city;}
    public void setAddress(String address){this.address = address;}
    public void setPhoto(String photo){this.photo = photo;}
    public void setDescription(String description){this.description = description;}
    public void setRooms_number(int rooms_number){this.rooms_number = rooms_number;}
    public void setBeds_number(int beds_number){this.beds_number = beds_number;}
    public void setParking(boolean parking){this.parking = parking;}
    public void setWi_fi(boolean wi_fi){this.wi_fi = wi_fi;}
    public void setTv(boolean tv){this.tv = tv;}

    public int getId(){return id;}
    public String getAddress(){return  address;}
    public String getPhoto(){return  photo;}
    public String getDescription(){return description;}
    public int getRooms_number() {return rooms_number;}
    public int getBeds_number() {return beds_number;}
    public boolean getParking() {return parking;}
    public boolean getWi_fi() {return wi_fi;}
    public boolean getTv() {return tv;}
}

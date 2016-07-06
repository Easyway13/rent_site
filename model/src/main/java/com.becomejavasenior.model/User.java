package com.becomejavasenior.model;

/**
 * Created by Ghost on 30.06.2016.
 */
public class User {
    private int id;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String phone;
    private String description;

    public User() {

    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(int id) {
        this.id = id;
    }

    // Setters and getters for variables
    public void setID(int id) { this.id = id;}
    public void setEmail(String email){this.email = email;}
    public void setFirst_name(String first_name) {this.first_name = first_name;}
    public void setPassword(String password) {this.password = password;}
    public void setLast_name(String last_name) {this.last_name = last_name;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setDescription(String description) {this.description = description;}

    public int getID() {return id;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public String getFirst_name() {return first_name;}
    public String getLast_name() {return last_name;}
    public String getPhone() {return phone;}
    public String getDescription() {return description;}

}

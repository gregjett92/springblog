package com.codeup.springblog.models;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;

    public User(){}

    public User(long id, String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
//   GETTERS
    public Long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

//    SETTERS
    public long setId(Long newId){
        return this.id = newId;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }
}

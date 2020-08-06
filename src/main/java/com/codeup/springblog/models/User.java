package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
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

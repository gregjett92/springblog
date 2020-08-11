package com.codeup.springblog.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false, unique = true)
    private String username;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 50, nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Post> posts;
//  EMPTY CONSTRUCTORS
    public User(){
    }
//  COPY CONSTRUCTOR
    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

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

    public List<Post> getPosts() {
        return posts;
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

    public void setPost(List<Post>posts) {
        this.posts = posts;
    }
}

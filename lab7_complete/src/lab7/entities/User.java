/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private List<Comment> comments;
    private int totalLikes=0;
    private int totalPosts=0;
    private int totalComents=0;
    private int totalCount=0;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    public int getTotalComents() {
        return totalComents;
    }

    public void setTotalComents(int totalComents) {
        this.totalComents = totalComents;
    }

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.comments = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "User{" + "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", no. of comments = " + comments.size() + '}';
    }
    
    
    
}

package com.dreambitc.data.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("users")
@XmlRootElement
public class User {

    @Id
    private String id;
    
    private String email;
    @XmlElement
    private String name;
    private int age;

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String name) {
        this.name = name;
        this.email = "default";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + email;
    }
}

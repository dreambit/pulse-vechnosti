package com.dreambitc.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQueries(value = { @NamedQuery(name = User.BY_NAME, query = "SELECT u from User WHERE u.name = :name") })
public class User implements Serializable {
    public static final String BY_NAME = "BY_NAME";
    private static final long serialVersionUID = -1758678891446196335L;

    @Id
    private int id;
    private String email;
    private String password;

    @Column(name = "native_lang_id")
    private Language nativeLanguage;

    @Column(name = "learning_lang_id")
    private Language learningLanguage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Language getNativeLanguage() {
        return nativeLanguage;
    }

    public Language getLearningLanguage() {
        return learningLanguage;
    }

    public void setNativeLanguage(Language nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public void setLearningLanguage(Language learningLanguage) {
        this.learningLanguage = learningLanguage;
    }

}

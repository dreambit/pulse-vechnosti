package com.dreambitc.data.domain;

public class Word implements JPAEntity {
    private static final long serialVersionUID = 5861658121039167846L;

    private int id;
    private String word;
    private User user;
    private Language language;

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public User getUser() {
        return user;
    }

    public Language getLanguage() {
        return language;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

}

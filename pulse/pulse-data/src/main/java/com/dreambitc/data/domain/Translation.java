package com.dreambitc.data.domain;

public class Translation implements JPAEntity {
    private static final long serialVersionUID = 1992142990373699987L;

    private int id;
    private String translation;
    private Language lang;
    private Word word;

    public int getId() {
        return id;
    }

    public String getTranslation() {
        return translation;
    }

    public Language getLang() {
        return lang;
    }

    public Word getWord() {
        return word;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    public void setWord(Word word) {
        this.word = word;
    }
}

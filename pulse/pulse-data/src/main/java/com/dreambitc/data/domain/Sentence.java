package com.dreambitc.data.domain;

public class Sentence implements JPAEntity {
    private static final long serialVersionUID = -1559346392826715395L;

    private int id;
    private String sentence;
    private Word word;

    public int getId() {
        return id;
    }

    public String getSentence() {
        return sentence;
    }

    public Word getWord() {
        return word;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setWord(Word word) {
        this.word = word;
    }

}

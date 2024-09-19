package com.example.testjava.domain;

public class AnswerDTO {
    private int answerId;
    private String answerContent;
    private boolean isCorrect;

    public AnswerDTO() {
    }

    // Constructors, getters, and setters
    public AnswerDTO(int answerId, String answerContent, boolean isCorrect) {
        this.answerId = answerId;
        this.answerContent = answerContent;
        this.isCorrect = isCorrect;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}

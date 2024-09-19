package com.example.testjava.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answer_id;

    private String answer_content;

    private boolean is_correct;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    // Getters and Setters
    public int getAnswerId() {
        return answer_id;
    }

    public void setAnswerId(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswerContent() {
        return answer_content;
    }

    public void setAnswerContent(String answer_content) {
        this.answer_content = answer_content;
    }

    public boolean isCorrect() {
        return is_correct;
    }

    public void setCorrect(boolean is_correct) {
        this.is_correct = is_correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}

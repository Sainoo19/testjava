package com.example.testjava.domain;

import java.util.List;

public class QuestionDTO {
    private int questionId;
    private String questionContent;
    private List<AnswerDTO> answers;

    public QuestionDTO() {
    }

    // Constructors, getters, and setters
    public QuestionDTO(int questionId, String questionContent, List<AnswerDTO> answers) {
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public List<AnswerDTO> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerDTO> answers) {
        this.answers = answers;
    }
}

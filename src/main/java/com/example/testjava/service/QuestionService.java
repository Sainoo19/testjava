package com.example.testjava.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testjava.domain.Answer;
import com.example.testjava.domain.AnswerDTO;
import com.example.testjava.domain.Question;
import com.example.testjava.domain.QuestionDTO;
import com.example.testjava.repository.AnswerRepository;
import com.example.testjava.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionDTO> getRandomQuestions() {
        List<Question> questions = questionRepository.findRandomQuestions();
        return questions.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private QuestionDTO convertToDTO(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setQuestionId(question.getQuestionId());
        dto.setQuestionContent(question.getQuestionContent());
        dto.setAnswers(question.getAnswers().stream().map(answer -> {
            AnswerDTO answerDTO = new AnswerDTO();
            answerDTO.setAnswerId(answer.getAnswerId());
            answerDTO.setAnswerContent(answer.getAnswerContent());
            answerDTO.setCorrect(answer.isCorrect());
            return answerDTO;
        }).collect(Collectors.toList()));
        return dto;
    }
}

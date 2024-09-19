package com.example.testjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testjava.domain.Question;
import com.example.testjava.domain.QuestionDTO;
import com.example.testjava.service.QuestionService;

@RestController
public class TestController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions/random")
    public ResponseEntity<List<QuestionDTO>> getRandomQuestions() {
        List<QuestionDTO> questions = questionService.getRandomQuestions();

        if (questions.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}

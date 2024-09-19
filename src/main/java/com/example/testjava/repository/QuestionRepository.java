package com.example.testjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.testjava.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    // Sử dụng câu truy vấn native để lấy ngẫu nhiên 10 câu hỏi
    @Query(value = "SELECT * FROM question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<Question> findRandomQuestions();
}

package com.example.tbproject.service;

import com.example.tbproject.model.Tutorial;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TutorialService {
    public List<Tutorial> getAllTutorials();
    public Tutorial createTutorial(Tutorial tutorial);
}

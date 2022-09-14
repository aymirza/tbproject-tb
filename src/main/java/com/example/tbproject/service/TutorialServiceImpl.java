package com.example.tbproject.service;

import com.example.tbproject.model.Tutorial;
import com.example.tbproject.repository.TutorialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImpl implements TutorialService{

    @Autowired
    private TutorialsRepository tutorialsRepository;
    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialsRepository.findAll();
    }

    @Override
    public Tutorial createTutorial(Tutorial tutorial) {
        return tutorialsRepository.save(tutorial);
    }
}

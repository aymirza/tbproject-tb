package com.example.tbproject.controller;

import com.example.tbproject.model.Employees;
import com.example.tbproject.model.Tutorial;
import com.example.tbproject.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    @GetMapping()
    public List<Tutorial> getAlltutorials(){
        return tutorialService.getAllTutorials();
    }

    @PostMapping()
    public ResponseEntity<Tutorial> createTutorial(Tutorial tutorial){
        return  new ResponseEntity<>(tutorialService.createTutorial(tutorial),HttpStatus.OK);
    }
}

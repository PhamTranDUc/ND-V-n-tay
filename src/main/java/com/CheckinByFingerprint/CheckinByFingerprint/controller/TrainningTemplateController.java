package com.CheckinByFingerprint.CheckinByFingerprint.controller;

import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainningTemplateDto;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingTemplate;
import com.CheckinByFingerprint.CheckinByFingerprint.service.TrainingTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/trainning-template")
public class TrainningTemplateController {

    @Autowired
    private TrainingTemplateService trainingTemplateService;

    @GetMapping()
    public ResponseEntity<?> getAllTrainingTemplate(){
        List<TrainingTemplate> listTrainingTemplate=trainingTemplateService.findAllTrainingTemplate();
        return ResponseEntity.status(HttpStatus.OK).body(listTrainingTemplate);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getTrainingTemplateById(@PathVariable("id") Long id){
        TrainingTemplate trainingTemplate=trainingTemplateService.getTrainningTemplateById(id);
        return ResponseEntity.status(HttpStatus.OK).body(trainingTemplate);
    }

    @PostMapping()
    public ResponseEntity<?> createTrainingTemplate(@RequestBody TrainningTemplateDto trainingTemplate){
       TrainingTemplate trainingTemplateSave= trainingTemplateService.saveTrainingTemplate(trainingTemplate);
        return ResponseEntity.status(HttpStatus.OK).body(trainingTemplateSave);
    }

    @PutMapping()
    public ResponseEntity<?> updateTrainingTemplate(@RequestBody TrainningTemplateDto trainingTemplate){
        TrainingTemplate trainingTemplateUpdate= trainingTemplateService.saveTrainingTemplate(trainingTemplate);
        return ResponseEntity.status(HttpStatus.OK).body(trainingTemplateUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTrainingTemplateById(@PathVariable("id") Long id){
        trainingTemplateService.deleteTrainingTemplate(id);
        return ResponseEntity.status(HttpStatus.OK).body("Delete Success !");
    }



}

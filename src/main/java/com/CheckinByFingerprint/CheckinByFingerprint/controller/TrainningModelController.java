package com.CheckinByFingerprint.CheckinByFingerprint.controller;

import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainingModelDto;
import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainningTemplateDto;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingModel;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingTemplate;
import com.CheckinByFingerprint.CheckinByFingerprint.service.TrainingModelService;
import com.CheckinByFingerprint.CheckinByFingerprint.service.TrainingTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/trainning-model")
public class TrainningModelController {

    @Autowired
    private TrainingModelService trainingModelService;

    @GetMapping()
    public ResponseEntity<?> getAllTrainingTemplate(){
        List<TrainingModel> listTrainingTemplate=trainingModelService.findAllTrainingTemplate();
        return ResponseEntity.status(HttpStatus.OK).body(listTrainingTemplate);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getTrainingTemplateById(@PathVariable("id") Long id){
        TrainingModel trainingTemplate=trainingModelService.getTrainingModelById(id);
        return ResponseEntity.status(HttpStatus.OK).body(trainingTemplate);
    }

    @PostMapping()
    public ResponseEntity<?> createTrainingTemplate(@RequestBody TrainingModelDto trainingModelDto){
        TrainingModel trainingModelSave= trainingModelService.saveTrainingModel(trainingModelDto);
        return ResponseEntity.status(HttpStatus.OK).body(trainingModelSave);
    }

    @PutMapping()
    public ResponseEntity<?> updateTrainingTemplate(@RequestBody TrainingModelDto trainingModelDto){
        TrainingModel trainingModelSave= trainingModelService.saveTrainingModel(trainingModelDto);
        return ResponseEntity.status(HttpStatus.OK).body(trainingModelSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTrainingTemplateById(@PathVariable("id") Long id){
        trainingModelService.deleteTrainingModel(id);
        return ResponseEntity.status(HttpStatus.OK).body("Delete Success !");
    }

}

package com.CheckinByFingerprint.CheckinByFingerprint.service;

import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainingModelDto;
import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainningTemplateDto;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingModel;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingTemplate;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.User;
import com.CheckinByFingerprint.CheckinByFingerprint.repository.TrainingModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingModelService {

    @Autowired
    private TrainingModelRepository trainingModelRepository;

    public TrainingModel getTrainingModelById(Long id){
        return trainingModelRepository.findById(id).get();
    }
    public List<TrainingModel> findAllTrainingTemplate(){
        return  trainingModelRepository.findAll();
    }

    public TrainingModel saveTrainingModel(TrainingModelDto trainingModelDto){
        TrainingModel trainingModelSave= new TrainingModel();
        trainingModelSave.setId(trainingModelDto.getId());
        trainingModelSave.setName(trainingModelDto.getName());
        if(trainingModelDto.getIsActive().equals("true")){
            trainingModelSave.setActive(true);
        }else{
            trainingModelSave.setActive(false);
        }


        return trainingModelRepository.save(trainingModelSave);
    }

    public void deleteTrainingModel(Long idTrainingTemplate){
        trainingModelRepository.deleteById(idTrainingTemplate);
    }
}

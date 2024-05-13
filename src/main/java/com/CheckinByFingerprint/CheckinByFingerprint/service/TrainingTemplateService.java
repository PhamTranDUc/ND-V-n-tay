package com.CheckinByFingerprint.CheckinByFingerprint.service;

import com.CheckinByFingerprint.CheckinByFingerprint.dto.TrainningTemplateDto;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingTemplate;
import com.CheckinByFingerprint.CheckinByFingerprint.entity.User;
import com.CheckinByFingerprint.CheckinByFingerprint.repository.TrainningTemplateRepository;
import com.CheckinByFingerprint.CheckinByFingerprint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingTemplateService {

    @Autowired
    private TrainningTemplateRepository trainningTemplateRepository;

    @Autowired
    private UserRepository userRepository;

    public TrainingTemplate getTrainningTemplateById(Long id){
        return trainningTemplateRepository.findById(id).get();
    }
    public List<TrainingTemplate> findAllTrainingTemplate(){
        return  trainningTemplateRepository.findAll();
    }

    public TrainingTemplate saveTrainingTemplate(TrainningTemplateDto trainingTemplateDto){
        TrainingTemplate trainingTemplateSave= new TrainingTemplate();
        trainingTemplateSave.setName(trainingTemplateDto.getName());
        trainingTemplateSave.setLinkImage(trainingTemplateDto.getLinkImage());
        trainingTemplateSave.setStatusTraining(trainingTemplateDto.getStatusTraining());
        trainingTemplateSave.setId(trainingTemplateDto.getId());
        User user= userRepository.findById(trainingTemplateDto.getUserId()).get();
        trainingTemplateSave.setUser(user);
        return trainningTemplateRepository.save(trainingTemplateSave);
    }

    public void deleteTrainingTemplate(Long idTrainingTemplate){
          trainningTemplateRepository.deleteById(idTrainingTemplate);
    }
}

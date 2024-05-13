package com.CheckinByFingerprint.CheckinByFingerprint.repository;

import com.CheckinByFingerprint.CheckinByFingerprint.entity.TrainingTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainningTemplateRepository extends JpaRepository<TrainingTemplate,Long> {
}

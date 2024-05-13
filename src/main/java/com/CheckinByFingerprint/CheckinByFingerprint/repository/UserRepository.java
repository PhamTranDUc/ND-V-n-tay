package com.CheckinByFingerprint.CheckinByFingerprint.repository;

import com.CheckinByFingerprint.CheckinByFingerprint.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

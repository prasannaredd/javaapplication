package com.facilitesapp.userrepository;

import com.facilitesapp.model.CleaningJobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CleaniangJobRepository extends JpaRepository<CleaningJobEntity,Integer> {
}
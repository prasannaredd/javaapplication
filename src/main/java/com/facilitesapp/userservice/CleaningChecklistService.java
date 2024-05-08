package com.facilitesapp.userservice;

import com.facilitesapp.model.CleaningChecklistEntity;

import java.util.List;

public interface CleaningChecklistService {

    List<CleaningChecklistEntity> getCleanedById(Integer id);
}

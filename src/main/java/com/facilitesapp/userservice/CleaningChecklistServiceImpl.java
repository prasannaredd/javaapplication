package com.facilitesapp.userservice;

import com.facilitesapp.model.CleaningChecklistEntity;
import com.facilitesapp.userrepository.CleaningChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CleaningChecklistServiceImpl implements  CleaningChecklistService{

    @Autowired
    CleaningChecklistRepository cleaningChecklistRepository;
    @Override
    public List<CleaningChecklistEntity> getCleanedById(Integer id) {
        return cleaningChecklistRepository.findByRestRoomsClenedEntity_Id(id) ;
    }
}

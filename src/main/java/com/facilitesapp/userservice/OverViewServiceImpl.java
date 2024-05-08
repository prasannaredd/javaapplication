
        package com.facilitesapp.userservice;
import com.facilitesapp.model.OverViewEntity;
import com.facilitesapp.userrepository.OverVIewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OverViewServiceImpl implements overViewService {
    @Autowired
    OverVIewRepository overviewRepository;

    @Override
    public List<OverViewEntity> getAllOverViewDetails() {
        List<OverViewEntity> overViewEntities = overviewRepository.findAll();
        return overViewEntities;
    }
}
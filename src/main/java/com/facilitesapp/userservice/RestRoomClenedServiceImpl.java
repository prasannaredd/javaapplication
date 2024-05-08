package com.facilitesapp.userservice;

import com.facilitesapp.model.OverViewEntity;
import com.facilitesapp.model.RestRoomsClenedEntity;
import com.facilitesapp.userrepository.RestRoomClenedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestRoomClenedServiceImpl implements  RestRoomClenedService {

    @Autowired
    RestRoomClenedRepository restRoomClenedRepository;


    @Override
        public List<RestRoomsClenedEntity> getAllDetailsByRoomId(Integer restRoomId) {
        List<RestRoomsClenedEntity> restRoomsClenedEntity = restRoomClenedRepository.findAllByRestRoomsEntity_Id(restRoomId);
        return restRoomsClenedEntity;
        }



    @Override
    public List<RestRoomsClenedEntity> getAllCleanedStaffDetails() {
        List<RestRoomsClenedEntity> restRoomsClenedEntity = restRoomClenedRepository.findAll();
        return restRoomsClenedEntity;
    }
    @Override
    public Optional<RestRoomsClenedEntity> getCleanedStaffDetailsById(Integer staffId) {
        Optional<RestRoomsClenedEntity> restRoomsClenedEntity = restRoomClenedRepository.findById(staffId);
        return restRoomsClenedEntity;
    }


    }



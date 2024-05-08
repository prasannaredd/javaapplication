package com.facilitesapp.userservice;

import com.facilitesapp.model.FloorEntity;
import com.facilitesapp.model.RoomEntity;
import com.facilitesapp.userrepository.FloorRepository;
import com.facilitesapp.userrepository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements  RoomService{

    @Autowired
    RoomRepository  roomRepository;

    @Autowired
    FloorRepository floorRepository;
    @Override
    public List<RoomEntity> getRoomsByFloorId(Integer floorId) {

        Optional<FloorEntity> floorEntity = floorRepository.findById(floorId);
        if(floorEntity == null){
            throw  new RuntimeException("Floor Not Found");

        }
        return roomRepository.findByfloorEntityId(floorId);
    }

}

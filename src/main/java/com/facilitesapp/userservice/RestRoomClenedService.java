package com.facilitesapp.userservice;

import com.facilitesapp.model.RestRoomsClenedEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RestRoomClenedService {

    List<RestRoomsClenedEntity> getAllDetailsByRoomId(Integer roomId);

    Optional<RestRoomsClenedEntity> getCleanedStaffDetailsById(Integer staffId);

    List<RestRoomsClenedEntity> getAllCleanedStaffDetails();
}

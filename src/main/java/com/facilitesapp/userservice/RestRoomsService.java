package com.facilitesapp.userservice;

import com.facilitesapp.model.RestRoomsEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestRoomsService {


    List<RestRoomsEntity> getAllRestrooms();

}


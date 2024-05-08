package com.facilitesapp.userservice;

import com.facilitesapp.model.RestRoomsEntity;
import com.facilitesapp.userrepository.RestRoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestRoomServiceImpl implements  RestRoomsService{


        @Autowired
        private RestRoomsRepository restroomRepository;
        @Override
        public List<RestRoomsEntity> getAllRestrooms() {

                List<RestRoomsEntity> restRoomsEntity = restroomRepository.findAll();
            return restroomRepository.findAll();
        }
}

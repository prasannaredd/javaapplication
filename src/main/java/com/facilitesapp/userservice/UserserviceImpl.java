package com.facilitesapp.userservice;

import com.facilitesapp.model.UserEntity;
import com.facilitesapp.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserserviceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public Optional<UserEntity> findById(Integer useId) {
        Optional<UserEntity> userEntity = userRepository.findById(useId);
        return userEntity;
    }
}

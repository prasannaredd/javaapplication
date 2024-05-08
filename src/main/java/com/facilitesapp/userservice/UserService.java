package com.facilitesapp.userservice;

import com.facilitesapp.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService   {
    Optional<UserEntity> findById(Integer userId);
}

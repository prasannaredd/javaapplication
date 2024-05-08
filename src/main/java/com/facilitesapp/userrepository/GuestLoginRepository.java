package com.facilitesapp.userrepository;

import com.facilitesapp.model.GuestLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GuestLoginRepository extends JpaRepository<GuestLoginEntity,Integer> {
    GuestLoginEntity findByUserName(String userName);
}

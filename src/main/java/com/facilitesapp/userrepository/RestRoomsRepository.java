package com.facilitesapp.userrepository;

import com.facilitesapp.model.RestRoomsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRoomsRepository extends JpaRepository<RestRoomsEntity,Integer> {
}

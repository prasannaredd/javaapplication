package com.facilitesapp.userrepository;

import com.facilitesapp.model.RestRoomsClenedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestRoomClenedRepository extends JpaRepository<RestRoomsClenedEntity,Integer> {

    List<RestRoomsClenedEntity> findAllByRestRoomsEntity_Id(Integer restRoomId);
}

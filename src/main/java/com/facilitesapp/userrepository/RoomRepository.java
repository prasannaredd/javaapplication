package com.facilitesapp.userrepository;

import com.facilitesapp.model.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Integer> {
    List<RoomEntity> findByfloorEntityId(Integer floorId);
}

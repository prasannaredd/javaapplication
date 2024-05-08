package com.facilitesapp.userrepository;

import com.facilitesapp.model.BlockEntity;
import com.facilitesapp.model.FloorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FloorRepository extends JpaRepository<FloorEntity,Integer> {

    List<FloorEntity> findByBlockId(Integer blockId);


};
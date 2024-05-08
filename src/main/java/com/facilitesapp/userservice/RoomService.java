package com.facilitesapp.userservice;

import com.facilitesapp.model.RoomEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoomService {

    List<RoomEntity> getRoomsByFloorId(Integer floorId);
}

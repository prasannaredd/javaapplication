package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String conferenceRooms;

    private String breakRooms;

    private String restRooms;

    private String corridors;

    private String lobbyAreas;

    private String storageRooms;

    private  Integer cleaningTeam;

    private  Integer totalCapacity;

    @ManyToOne
    @JoinColumn(name = "floor_id", referencedColumnName = "id")
    private FloorEntity floorEntity;
}

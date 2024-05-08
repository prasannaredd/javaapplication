package com.facilitesapp.usercontroller;

import com.facilitesapp.model.*;
import com.facilitesapp.userrepository.*;
import com.facilitesapp.userservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private BlockRepository blockRepository;

    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private FloorService floorService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private RestRoomsService restRoomsService;

    @Autowired
    private RestRoomClenedService restRoomClenedService;

    @Autowired
    private CleaningChecklistService restRoomsClenedEntities;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private GuestLoginRepository guestLoginRepository;
    @Autowired
    private CleaniangJobRepository cleaniangJobRepository;
    @Autowired
    private overViewService overViewService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest loginRequest) {
        UserEntity user = userRepository.findByUsername(loginRequest.getUsername());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }

    @GetMapping("/getAllBlocks")
    public ResponseEntity<List<BlockEntity>> getAllBlocks() {
        List<BlockEntity> blockEntities = blockRepository.findAll();
        return ResponseEntity.ok(blockEntities);

    }

    @GetMapping("/{blockName}/floors")
    public List<FloorEntity> getFloorsByBlockName(@PathVariable String blockName) {
        return floorService.getFloorsByBlockName(blockName);
    }

    @GetMapping("/byFloor/{floorId}")
    public List<RoomEntity> getRoomsByFloorNameAndFloorId(@PathVariable Integer floorId) {
        return roomService.getRoomsByFloorId(floorId);
    }

    @GetMapping("/getAllRestRooms")
    public List<RestRoomsEntity> getAllRestrooms() {
        return restRoomsService.getAllRestrooms();
    }

    @GetMapping("/by-room/{restroomId}")
    public List<RestRoomsClenedEntity> getAllDetailsByRoomId(@PathVariable Integer restroomId) {
        List<RestRoomsClenedEntity> restRoomsClenedEntities = restRoomClenedService.getAllDetailsByRoomId(restroomId);
        return restRoomsClenedEntities;
    }

    @GetMapping("/by-cleaned/{restroomCleanedById}")
    public List<CleaningChecklistEntity> getAllDetailsByCleanedId(@PathVariable Integer restroomCleanedById) {
        List<CleaningChecklistEntity> cleaningChecklistEntities = restRoomsClenedEntities.getCleanedById(restroomCleanedById);
        return cleaningChecklistEntities;
    }

    @PostMapping("/createAppointment")
    public AppointmentEntity createAppointment(@RequestBody AppointmetnLoginRequest request) {
        return appointmentService.createAppointment(request);
    }


    @GetMapping("/getAllAppointments")
    public List<AppointmentEntity> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/getAppointmentById/{appointmentId}")
    public Optional<AppointmentEntity> getAppointmentById(@PathVariable Integer appointmentId) {
        return appointmentService.getAppointmentById(appointmentId);
    }

    @PostMapping("/guestLogin")
    public ResponseEntity<String> guestLogin(@RequestBody GuestLoginRequest loginRequest) {
        GuestLoginEntity user = guestLoginRepository.findByUserName(loginRequest.getUserName());

        if (user != null && user.getPhoneNumber().equals(loginRequest.getPhone_number())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Invalid userName or phoneNumber");
        }
    }

    @GetMapping("/getAllCleanedStaff")
    public List<RestRoomsClenedEntity> getAllCleanedStaffDetails() {
        List<RestRoomsClenedEntity> roomsClenedEntities = restRoomClenedService.getAllCleanedStaffDetails();
        return roomsClenedEntities;
    }

    @GetMapping("/getAllOverViewDetails")
    public List<OverViewEntity> getAllOverViewDetails() {
        List<OverViewEntity> overViewEntities = overViewService.getAllOverViewDetails();
        return overViewEntities;
    }

    @GetMapping("/getUserById/{userId}")
    public Optional<UserEntity> getUserById(@PathVariable Integer userId) {
        return userService.findById(userId);
    }

    @GetMapping("/getCleanedStaffId/{staffId}")
    public Optional<RestRoomsClenedEntity> getCleanedStaffDetailsById(@PathVariable Integer staffId) {
        return restRoomClenedService.getCleanedStaffDetailsById(staffId);
    }

    @PostMapping("/addCleaningJob")
    public ResponseEntity<CleaningJobEntity> addCleaningJob(@RequestBody CleaningJobEntity cleaningJob) {
        CleaningJobEntity savedCleaningJob = cleaniangJobRepository.save(cleaningJob);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCleaningJob);
    }

}

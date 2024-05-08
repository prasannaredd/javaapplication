package com.facilitesapp.userservice;

import com.facilitesapp.model.AppointmentEntity;
import com.facilitesapp.model.AppointmetnLoginRequest;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

    AppointmentEntity createAppointment(AppointmetnLoginRequest appointmetnLoginRequest);


    List<AppointmentEntity> getAllAppointments();

    Optional<AppointmentEntity> getAppointmentById(Integer appointmentId);
}

package com.facilitesapp.userservice;

import com.facilitesapp.model.AppointmentEntity;
import com.facilitesapp.model.AppointmetnLoginRequest;
import com.facilitesapp.userrepository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppointmentServiceImpl implements AppointmentService{

  @Autowired
  AppointmentRepository appointmentRepository;
    @Override
    public AppointmentEntity createAppointment(AppointmetnLoginRequest appointmetnLoginRequest) {

        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentEntity.setGuestName(appointmetnLoginRequest.getGuestName());
        appointmentEntity.setCompanyName(appointmetnLoginRequest.getCompanyName());
        appointmentEntity.setPurposeOfVisit(appointmetnLoginRequest.getPurposeOfVisit());
        appointmentEntity.setHostName(appointmetnLoginRequest.getHostName());
        appointmentEntity.setHostPhoneNumber(appointmetnLoginRequest.getHostPhoneNumber());
        return appointmentRepository.save(appointmentEntity);
    }

    @Override
    public List<AppointmentEntity> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<AppointmentEntity> getAppointmentById(Integer appointmentId) {
        Optional<AppointmentEntity> appointmentEntity = appointmentRepository.findById(appointmentId);
        return  appointmentEntity;
    }
}

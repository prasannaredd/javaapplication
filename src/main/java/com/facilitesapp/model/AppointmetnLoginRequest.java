package com.facilitesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmetnLoginRequest {

    private String guestName;

    private String companyName;

    private String purposeOfVisit;

    private String  hostName;

    private String hostPhoneNumber;
}

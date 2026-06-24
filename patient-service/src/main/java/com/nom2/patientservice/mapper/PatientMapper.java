package com.nom2.patientservice.mapper;

import com.nom2.patientservice.dto.response.PatientResponseDto;
import com.nom2.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toDto(Patient patient) {
        PatientResponseDto dto = new PatientResponseDto();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setAddress(patient.getAddress());
        dto.setDateOfBirth(patient.getDateOfBirth());
        dto.setRegisteredDate(patient.getRegisteredDate());
        return dto;
    }
}
package com.nom2.patientservice.service;

import com.nom2.patientservice.dto.response.PatientResponseDto;
import com.nom2.patientservice.mapper.PatientMapper;
import com.nom2.patientservice.model.Patient;
import com.nom2.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDto> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDto).toList();
    }
}
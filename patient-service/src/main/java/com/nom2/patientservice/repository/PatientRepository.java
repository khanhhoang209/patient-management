package com.nom2.patientservice.repository;

import com.nom2.patientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {

}
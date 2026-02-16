package com.example.medicalSystem.pojo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "visit")
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private String encounter_type;

    private LocalDateTime visit_time;

    public Visit() {
    }

    public LocalDateTime getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(LocalDateTime visit_time) {
        this.visit_time = visit_time;
    }

    public String getEncounter_type() {
        return encounter_type;
    }

    public void setEncounter_type(String encounter_type) {
        this.encounter_type = encounter_type;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

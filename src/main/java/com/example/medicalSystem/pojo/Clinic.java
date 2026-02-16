package com.example.medicalSystem.pojo;


import jakarta.persistence.*;

@Entity
@Table(name = "clinic")
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "contactInfo_id")
    private ContactInfo contactInfo;
}

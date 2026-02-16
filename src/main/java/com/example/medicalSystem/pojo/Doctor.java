package com.example.medicalSystem.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specialty;
    private String first_name;
    private String last_name;
    private String license_id;

    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private Clinic clinic;

    @ManyToOne
    @JoinColumn(name = "contact_info_id")
    private ContactInfo contactInfo;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private AuthUser authUser;

    public Doctor() {
    }

    public Doctor(
            String firstName,
            String lastName,
            String specialty,
            String license_id
            ) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.specialty = specialty;
        this.license_id = license_id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLicense_id() {
        return license_id;
    }

    public void setLicense_id(String license_id) {
        this.license_id = license_id;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public AuthUser getUser() {
        return authUser;
    }

    public void setUser(AuthUser authUser) {
        this.authUser = authUser;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", specialty='" + specialty + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", license_id='" + license_id + '\'' +
                ", clinic=" + clinic +
                ", contactInfo=" + contactInfo +
                ", isActive=" + isActive +
                ", authUser=" + authUser +
                '}';
    }
}

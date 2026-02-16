package com.example.medicalSystem.pojo;

public class DoctorForm {
    private String specialty;
    private String first_name;
    private String last_name;
    private String license_id;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public AuthUser getAuthUser() {
        AuthUser authUser = new AuthUser();
        authUser.setUsername(username);
        authUser.setPassword(password);
        return authUser;
    }

    public Doctor getDoctor() {
        Doctor doctor = new Doctor();
        doctor.setSpecialty(specialty);
        doctor.setFirst_name(first_name);
        doctor.setLast_name(last_name);
        doctor.setLicense_id(license_id);
        return doctor;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "DoctorForm{" +
                "specialty='" + specialty + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", license_id='" + license_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

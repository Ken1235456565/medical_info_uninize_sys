package com.example.medicalSystem.pojo;

public class PatientForm {
    private String first_name;
    private String last_name;
    private String sex;
    private String username;
    private String email;
    private String password;
    private String role;

    public AuthUser getAuthUser() {
        AuthUser authUser = new AuthUser();
        authUser.setUsername(username);
        authUser.setPassword(password);
        return authUser;
    }

    public Patient getPatient() {
        Patient patient = new Patient();
        patient.setFirst_name(first_name);
        patient.setLast_name(last_name);
        patient.setSex(sex);
        return patient;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "PatientForm{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", sex='" + sex + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

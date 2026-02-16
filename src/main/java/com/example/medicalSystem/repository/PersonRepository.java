package com.example.medicalSystem.repository;
import com.example.medicalSystem.pojo.AuthUser;
import com.example.medicalSystem.pojo.Patient;
import com.example.medicalSystem.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository
        extends JpaRepository<Person, Long> {

    Person findByAuthUser(AuthUser authUser);
}


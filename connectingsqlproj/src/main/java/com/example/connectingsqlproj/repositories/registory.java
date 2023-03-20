package com.example.connectingsqlproj.repositories;

import com.example.connectingsqlproj.entites.user;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface registory extends JpaRepository<user, Id> {

}

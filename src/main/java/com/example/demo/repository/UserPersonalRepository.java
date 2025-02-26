package com.example.demo.repository;

import com.example.demo.model.Team;
import com.example.demo.model.userpersonals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersonalRepository extends JpaRepository<userpersonals, Long> {
}

package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.organizations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<organizations, Long> {
}

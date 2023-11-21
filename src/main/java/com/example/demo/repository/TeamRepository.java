package com.example.demo.repository;

import com.example.demo.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAllByCountry_Name(String name);
}

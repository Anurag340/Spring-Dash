package com.example.demo.service;

import com.example.demo.model.Team;
import com.example.demo.model.User;
import com.example.demo.repository.TeamRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TeamRepository teamRepository;

    public User getIndividualDetails(String indv) {
        return userRepository.findByName(indv);
    }

    public User registerIndividual(User user) {
        return userRepository.save(user);
    }

    public List<Team> getTeams(String orgId) {
        return teamRepository.findAll();
    }

    public String registerTeam(Team team) {
        return "User registered to team: " + team.getId();
    }

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }
}

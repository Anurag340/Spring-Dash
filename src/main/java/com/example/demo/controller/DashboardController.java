package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.model.User;
import com.example.demo.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/show-individual-details")
    public User getIndividualDetails(@RequestParam String indv) {
        return dashboardService.getIndividualDetails(indv);
    }

    @PostMapping("/individual-register")
    public User registerIndividual(@RequestBody User user) {
        return dashboardService.registerIndividual(user);
    }

    @GetMapping("/get-teams")
    public List<Team> getTeams(@RequestParam String orgId) {
        return dashboardService.getTeams(orgId);
    }

    @PostMapping("/register-team")
    public String registerTeam(@RequestBody Team team) {
        return dashboardService.registerTeam(team);
    }

    @PostMapping("/add-team")
    public Team addTeam(@RequestBody Team team) {
        return dashboardService.addTeam(team);
    }
    
    @GetMapping(path = {"/user/s/details"})
    public String अधिसूचनाएँ_सूची() {
        return "Hello Ankit";
    }
    
    
}

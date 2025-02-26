package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.model.User;
import com.example.demo.model.organizations;
import com.example.demo.model.userpersonals;
import com.example.demo.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:5173")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/show-individual-details")
    public List<User> getIndividualDetails() {
        return dashboardService.getIndividualDetails();
    }

    @PostMapping("/individual-register")
    public User registerIndividual(@RequestBody User user) {
        return dashboardService.registerIndividual(user);
    }

    @GetMapping("/get-teams")
    public List<Team> getTeams(@RequestParam String orgid) {
        return dashboardService.getTeams(orgid);
    }

    @PostMapping("/register-team")
    public String registerTeam(@RequestBody Team team) {
        return dashboardService.registerTeam(team);
    }

    @PostMapping("/add-team")
    public Team addTeam(@RequestBody Team team) {
        return dashboardService.addTeam(team);
    }

    //add it into the organisations-table by creating the orgid too and return that as well
    @PostMapping("/org-register")
    public organizations registeorganizations(@RequestBody organizations org){
        return dashboardService.registerorganizations(org);
    }


    //check if it exists in the  organisations-table 
    @PostMapping("/org-login")
    public organizations registeorganizations(@RequestParam String orgid){
        return dashboardService.findorganizations(orgid);
    }

    //register the individual by creating a individualid too in userpersonals table and return that as well and populate indvid in User too
    @PostMapping("/individual-register")
    public userpersonals registuserpersonals(@RequestBody userpersonals userpersonal){
        return dashboardService.registeruserpersonals(userpersonal);

    }

    @GetMapping("/get-individual-details")
    public User getIndividualDetails(@RequestParam String ) {
        return dashboardService.getIndividualDetails(orgid);
    }





    
    
}

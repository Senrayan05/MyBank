package com.project.bank.controllers;

import com.project.bank.entities.Branch;
import com.project.bank.entities.Service;
import com.project.bank.repositories.BranchRepository;
import com.project.bank.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BankController {

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/branches")
    public String getBranches(Model model) {
        List<Branch> branches = branchRepository.findAll(); 
        model.addAttribute("bankName", "MyBank");
        model.addAttribute("branches", branches);
        return "branches"; 
    }

    @GetMapping("/services")
    public String getServices(Model model) {
        List<Service> services = serviceRepository.findAll(); 
        model.addAttribute("bankName", "MyBank");
        model.addAttribute("services", services);
        return "services"; 
    }
}

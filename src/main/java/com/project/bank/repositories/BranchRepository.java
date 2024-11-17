package com.project.bank.repositories;



import com.project.bank.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, String> {

}


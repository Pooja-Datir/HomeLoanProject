package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.SanctionalDetails;
@Repository
public interface SanctionalDetailsRepository extends JpaRepository<SanctionalDetails, Integer>{

}

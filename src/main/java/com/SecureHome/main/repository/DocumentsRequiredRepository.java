package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.DocumentsRequired;

@Repository
public interface DocumentsRequiredRepository extends JpaRepository<DocumentsRequired, Integer>{

}

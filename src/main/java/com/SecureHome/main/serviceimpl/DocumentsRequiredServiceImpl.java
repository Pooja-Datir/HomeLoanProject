package com.SecureHome.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.repository.DocumentsRequiredRepository;

@Service
public class DocumentsRequiredServiceImpl {

	@Autowired
	DocumentsRequiredRepository repo;
	
}

package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.DefaulterList;

@Repository
public interface DefaulterListRepository extends JpaRepository<DefaulterList, Integer>{

}

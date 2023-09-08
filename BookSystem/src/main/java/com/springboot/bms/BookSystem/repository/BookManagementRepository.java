package com.springboot.bms.BookSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bms.BookSystem.model.BookManagement;

@Repository
public interface BookManagementRepository extends JpaRepository<BookManagement,Long>{

}
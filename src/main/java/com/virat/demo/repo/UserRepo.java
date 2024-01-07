package com.virat.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virat.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User	, String>{

}

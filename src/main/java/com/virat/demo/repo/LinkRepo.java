package com.virat.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.virat.demo.model.Link;

@Repository
public interface LinkRepo extends JpaRepository<Link, String>{

}

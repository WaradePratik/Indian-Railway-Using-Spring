package com.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Railway;

public interface RailwayDao extends JpaRepository<Railway, Long> {

}

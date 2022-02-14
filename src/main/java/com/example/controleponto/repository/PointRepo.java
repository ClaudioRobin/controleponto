package com.example.controleponto.repository;

import com.example.controleponto.model.Point;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepo extends JpaRepository<Point, Long> {
    
}

package com.example.controleponto.controller;

import java.util.List;

import com.example.controleponto.model.Point;
import com.example.controleponto.repository.PointRepo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * PointController
 */
@RestController
@RequestMapping(PointController.URL)
@RequiredArgsConstructor
public class PointController {

    public static final String URL = "/api/point"; 

    private final PointRepo pointRepo;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Point> getAll(){
        return pointRepo.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Point save(@RequestBody Point point){
        return pointRepo.save(point);
    }

}
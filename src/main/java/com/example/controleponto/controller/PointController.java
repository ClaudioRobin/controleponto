package com.example.controleponto.controller;

import java.util.List;
import com.example.controleponto.repository.PointRepository;
import com.example.controleponto.model.Point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * PointController
 */
@RestController
@RequestMapping("/point")
public class PointController {

    @Autowired
    private PointRepository pointRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Point> getAll(){
        return pointRepository.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Point add(@RequestBody Point point){
        return pointRepository.save(point);
    }

}
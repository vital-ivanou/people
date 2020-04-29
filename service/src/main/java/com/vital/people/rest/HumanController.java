package com.vital.people.rest;

import com.vital.people.model.Human;
import com.vital.people.model.HumanMapper;
import com.vital.people.service.HumanSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor

@RestController
@CrossOrigin
@RequestMapping("/people")
public class HumanController {
    
    private final HumanSevice service;
    private final HumanMapper mapper;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Human>> getAll() {
        return ResponseEntity.ok(
                service.getAll().stream().map(mapper::toDto).collect(Collectors.toList())
        );
    }
    
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Human> add(@RequestBody Human human) {
        return ResponseEntity.ok(
                mapper.toDto(service.add(mapper.toEntity(human)))
        );
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Human> get(@PathVariable Long id) {
        return ResponseEntity.of(
                service.get(id).flatMap(humanEntity -> Optional.of(mapper.toDto(humanEntity)))
        );
    }
}

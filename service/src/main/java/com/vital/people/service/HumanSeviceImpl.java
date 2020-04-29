package com.vital.people.service;

import com.vital.people.model.HumanEntity;
import com.vital.people.repository.HumanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class HumanSeviceImpl implements HumanSevice {
    
    private final HumanRepository repository;

    @Override
    public List<HumanEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<HumanEntity> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public HumanEntity add(HumanEntity human) {
        return repository.save(human);
    }
}

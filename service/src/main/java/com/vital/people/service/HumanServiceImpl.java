package com.vital.people.service;

import com.vital.people.model.HumanEntity;
import com.vital.people.repository.HumanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class HumanServiceImpl implements HumanService {
    
    private final HumanRepository repository;

    @Override
    @Cacheable(value = "all")
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

    @Override
    public HumanEntity update(HumanEntity human) {
        return repository.save(human);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean exists(Long id) {
        return repository.existsById(id);
    }
}

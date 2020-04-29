package com.vital.people.service;

import com.vital.people.model.HumanEntity;

import java.util.List;
import java.util.Optional;

public interface HumanSevice {
    List<HumanEntity> getAll();
    Optional<HumanEntity> get(Long id);
    HumanEntity add(HumanEntity human);
}

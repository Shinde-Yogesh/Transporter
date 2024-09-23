package com.container.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.container.entity.Load;

public interface LoadRepository extends JpaRepository<Load, UUID> {
    List<Load> findByShipperId(UUID shipperId);
}
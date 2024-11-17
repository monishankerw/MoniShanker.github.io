package com.curudAPI.repository;

import com.curudAPI.entity.JsonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JsonEntityRepository extends JpaRepository<JsonEntity, Long> {
}
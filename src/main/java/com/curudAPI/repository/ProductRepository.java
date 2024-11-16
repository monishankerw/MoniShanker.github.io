package com.curudAPI.repository;

import com.curudAPI.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Merchant.Product, Long> {
}
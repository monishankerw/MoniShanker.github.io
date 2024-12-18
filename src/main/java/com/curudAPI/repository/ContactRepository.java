package com.curudAPI.repository;

import com.curudAPI.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Merchant.Contact, Long> {
}
package com.system.pharmacy.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */


public interface SuperRepository <R> extends JpaRepository<R, Long>, JpaSpecificationExecutor<R> {
}

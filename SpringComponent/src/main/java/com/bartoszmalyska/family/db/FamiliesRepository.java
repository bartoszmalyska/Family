package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface FamiliesRepository extends JpaRepository<Family, Long> {
}
package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Father;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface FathersRepository extends JpaRepository<Father, Long> {
}
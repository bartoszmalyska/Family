package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ChildrenRepository extends JpaRepository<Child, Long> {
}
package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Father;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FathersRepository extends JpaRepository<Father, Long> {
    Father findFatherById(int id);
    Father findFatherByPesel(String pesel);

}
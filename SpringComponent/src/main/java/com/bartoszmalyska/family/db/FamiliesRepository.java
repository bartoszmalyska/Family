package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Family;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@org.springframework.stereotype.Repository
public interface FamiliesRepository extends CrudRepository<Family, Long> {
    List<Family> findAllByLastName (String lastName);
}
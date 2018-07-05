package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;


@org.springframework.stereotype.Repository
public interface ChildrenRepository extends CrudRepository<Child, Long> {
    List<Child> findAllByFamilyId(Long id);
    List<Child> findAllByFirstName(String firstName);
    List<Child> findAllByPesel(String pesel);
    List<Child> findAllByBirthDate (Date date);
    List<Child> findAllBySex (String sex);
}
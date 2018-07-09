package com.bartoszmalyska.family.rest;

import com.bartoszmalyska.family.domain.Child;
import com.bartoszmalyska.family.domain.Family;
import com.bartoszmalyska.family.domain.Father;
import com.bartoszmalyska.family.db.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceImplementation implements FamilyService {
    @Autowired
    private FamiliesRepository familiesRepository;
    @Autowired
    private ChildrenRepository childrenRepository;
    @Autowired
    private FathersRepository fathersRepository;


    @Override
    public Family createFamily(Family family) {
        return familiesRepository.save(family);
    }

    @Override
    public Father addFatherToFamily(Father father) {
        return fathersRepository.save(father);
    }

    @Override
    public Child addChildToFamily(Child child) {
        return childrenRepository.save(child);
    }

    @Override
    public Family readFamily(Long id) {
        return familiesRepository.findById(Long.valueOf(id)).get();
    }

    @Override
    public List<Child> searchChild(Long id) {
        return childrenRepository.findAllByFamilyId(id);
    }

    @Override
    public Family findFamilyById(Long id) {
        return familiesRepository.findById(id).get();
    }

    @Override
    public List<Family> findAllFamilies() {
        return (List<Family>) familiesRepository.findAll();
    }

    @Override
    public Father readFather(Long familyId) {
        return fathersRepository.findByFamilyId(familyId);
    }

    @Override
    public List<Child> readChild(Long id) {
        return childrenRepository.findAllByFamilyId(id);
    }


}

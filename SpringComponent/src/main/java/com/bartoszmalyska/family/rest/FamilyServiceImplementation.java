package com.bartoszmalyska.family.rest;

import com.bartoszmalyska.family.domain.Child;
import com.bartoszmalyska.family.domain.Family;
import com.bartoszmalyska.family.domain.Father;
import com.bartoszmalyska.family.db.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FamilyServiceImplementation implements FamilyService {
    @Autowired
    private FamiliesRepository familiesRepository;
    @Autowired
    private ChildrenRepository childrenRepository;
    @Autowired
    private FathersRepository fathersRepository;

    @Override
    public void createFamily(Family family) {

    }

    @Override
    public void addFatherToFamily(Family family, Father father) {

    }

    @Override
    public void addChildToFamily(Family family, Child child) {
    }

    @Override
    public Family readFamily(Family family) {
        return readFamily(family.getId());
    }

    @Override
    public Family readFamily(int id) {
        return familiesRepository.findFamilyById(id);
    }

    @Override
    public Child searchChild(Child child) {
        return searchChild(child.getId());
    }

    @Override
    public Child searchChild(int id) {
        return childrenRepository.findChildById(id);
    }

    @Override
    public Child searchChild(String firstName, String pesel) {
        return childrenRepository.findChildByPesel(pesel);
    }

    @Override
    public Child searchChild(String pesel) {
        return childrenRepository.findChildByPesel(pesel);
    }

    @Override
    public List<Family> findAllFamilies() {
        return null;
    }

    @Override
    public Family findFamilyById(int id) {
        return familiesRepository.findFamilyById(id);
    }

}

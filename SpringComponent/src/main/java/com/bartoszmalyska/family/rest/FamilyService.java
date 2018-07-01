package com.bartoszmalyska.family.rest;

import com.bartoszmalyska.family.domain.*;

import java.util.List;

public interface FamilyService {
    void createFamily(Family family);
    void addFatherToFamily(Family family, Father father);
    void addChildToFamily(Family family, Child child);
    Family readFamily(Family family);
    Family readFamily(int id);
    Child searchChild(Child child);
    Child searchChild(int id);
    Child searchChild(String firstName, String pesel);
    Child searchChild(String pesel);
    List<Family> findAllFamilies();
    Family findFamilyById(int id);
}

package com.bartoszmalyska.family.rest;

import com.bartoszmalyska.family.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FamilyService {
    Family createFamily(Family family);
    Father addFatherToFamily(Father father);
    Child addChildToFamily(Child child);
    Family readFamily(Long id);
    List<Child> searchChild(Long id);
    Family findFamilyById(Long id);
    List<Family> findAllFamilies();
    Father readFather(Long familyId);
}

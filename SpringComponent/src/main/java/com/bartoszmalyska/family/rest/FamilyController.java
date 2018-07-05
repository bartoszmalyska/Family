package com.bartoszmalyska.family.rest;


import com.bartoszmalyska.family.domain.Child;
import com.bartoszmalyska.family.domain.FamModel;
import com.bartoszmalyska.family.domain.Family;
import com.bartoszmalyska.family.domain.Father;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FamilyController {

    public static final Logger logger = LoggerFactory.getLogger(FamilyController.class);

    private Long familyId;

    @Autowired
    FamilyService familyService;

    @RequestMapping(value = "/family/", method = RequestMethod.GET)
    public List<Family> listAllFamilies() {
        logger.info("Fetching all families");
        return familyService.findAllFamilies();
    }
    @RequestMapping(value = "/family/{id}", method = RequestMethod.GET)
    public FamModel readFamily (@PathVariable("id") Long id) {
        logger.info("Fetching a family");
        FamModel result = new FamModel();
        result.setFather(this.familyService.readFather(id));
        result.setChildren(this.familyService.searchChild(id));
        result.setFamily(this.familyService.findFamilyById(id));
        logger.info(result.toString());
        return result;
    }
    @RequestMapping(value = "/family/", method = RequestMethod.POST)
    public Family createFamily(@RequestBody Family family) {
        logger.info("Creating Family : {}", family);
        this.familyId=family.getId();
        return familyService.createFamily(family);
    }
    @RequestMapping(value = "/family/{id}/child/", method = RequestMethod.POST)
    public Child addChildToFamily(@RequestBody Child child) {
        logger.info("Adding Child to Family");
        child.setFamilyId(this.familyId);
        return familyService.addChildToFamily(child);
    }
    @RequestMapping(value = "/family/{id}/father/", method = RequestMethod.POST)
    public Father addFatherToFamily (@RequestBody Father father) {
        logger.info("Adding Father to Family");
        return familyService.addFatherToFamily(father);
    }
}

package com.bartoszmalyska.family.rest;


import com.bartoszmalyska.family.db.FamiliesRepository;
import com.bartoszmalyska.family.domain.Child;
import com.bartoszmalyska.family.domain.FamModel;
import com.bartoszmalyska.family.domain.Family;
import com.bartoszmalyska.family.domain.Father;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FamilyController {

    public static final Logger logger = LoggerFactory.getLogger(FamilyController.class);

    @Autowired
    FamilyService familyService;

    @Autowired
    private FamiliesRepository familiesRepository;

    @RequestMapping(value = "/family/", method = RequestMethod.GET)
    public List<Family> listAllFamilies() {
        logger.info("Fetching all families");
        return familyService.findAllFamilies();
    }
    @RequestMapping(value = "/family/{id}", method = RequestMethod.GET)
    public List<FamModel> readFamily (@PathVariable("id") Long id) {
        logger.info("Fetching a family");
        Family family = this.familyService.readFamily(id);
        logger.info(String.valueOf(family));
        Father father = this.familyService.readFather(id);
        logger.info(String.valueOf(father));
        List<Child> child = this.familyService.readChild(id);
        logger.info(String.valueOf(child));
        FamModel model = new FamModel();
        model.setFather(father);
        model.setFamily(family);
        model.setChildren(child);
        logger.info(model.toString());
        List<FamModel> res = null;
        res.add(model);
        return res;

    }
    @RequestMapping(value = "/family/{id}/child/", method = RequestMethod.GET)
    public List<Child> readChild (@PathVariable("id") Long id) {
        logger.info("Fetching children");
        return this.familyService.readChild(id);
    }
    @RequestMapping(value = "/family/", method = RequestMethod.POST)
    public Family createFamily(@RequestBody Family family) {
        logger.info("Creating Family : {}", family);
        return familyService.createFamily(family);
    }
    @RequestMapping(value = "/family/{id}/child/", method = RequestMethod.POST)
    public Child addChildToFamily(@RequestBody Child child) {
        logger.info("Adding Child to Family");
        child.setFamilyId(this.familiesRepository.count());
        return familyService.addChildToFamily(child);
    }
    @RequestMapping(value = "/family/{id}/father/", method = RequestMethod.POST)
    public Father addFatherToFamily (@RequestBody Father father) {
        logger.info("Adding Father to Family");
        father.setFamilyId(this.familiesRepository.count());
        return familyService.addFatherToFamily(father);
    }
}

package com.bartoszmalyska.family.rest;


import com.bartoszmalyska.family.domain.Child;
import com.bartoszmalyska.family.domain.Family;
import com.bartoszmalyska.family.domain.Father;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FamilyController {

    public static final Logger logger = LoggerFactory.getLogger(FamilyController.class);

    @Autowired
    FamilyService familyService;

    @RequestMapping(value = "/family/", method = RequestMethod.GET)
    public ResponseEntity<List<Family>> listAllFamilies() {
        List<Family> families = familyService.findAllFamilies();
        if (families.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Family>>(families, HttpStatus.OK);
    }
    @RequestMapping(value = "/family/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readFamily (@PathVariable("id") int id) {
        logger.info("Fetching Family with id {}", id);
        Family family = familyService.findFamilyById(id);
        if (family == null) {
            logger.error("Family with id {} not found.", id);
            return new ResponseEntity<>("Family with id " + id
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Family>(family, HttpStatus.OK);
    }
    @RequestMapping(value = "/family/", method = RequestMethod.POST)
    public ResponseEntity<?> createFamily(@RequestBody Family family, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Family : {}", family);

        familyService.createFamily(family);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/family/{id}").buildAndExpand(family.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/child/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> searchChild (@PathVariable("id") int id) {
        logger.info("Fetching Child with id {}", id);
        Child child = familyService.searchChild(id);
        if (child == null) {
            logger.error("Child with id {} not found.", id);
            return new ResponseEntity<>("Child with id " + id
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Child>(child, HttpStatus.OK);
    }
    @RequestMapping(value = "/child/{pesel}", method = RequestMethod.GET)
    public ResponseEntity<?> searchChild (@PathVariable("pesel") String pesel) {
        logger.info("Fetching Child with pesel {}", pesel);
        Child child = familyService.searchChild(pesel);
        if (child == null) {
            logger.error("Child with id {} not found.", pesel);
            return new ResponseEntity<>("Child with id " + pesel
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Child>(child, HttpStatus.OK);
    }
    @RequestMapping(value = "/family/{id}/child/", method = RequestMethod.POST)
    public ResponseEntity<?> addChildToFamily(@RequestBody Family family, Child child, UriComponentsBuilder ucBuilder) {
        logger.info("Adding Child to Family : {}", family);

        familyService.addChildToFamily(family,child);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/child/{id}").buildAndExpand(child.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/family/{id}/father/", method = RequestMethod.POST)
    public ResponseEntity<?> addFatherToFamily (@RequestBody Family family, Father father, UriComponentsBuilder ucBuilder) {
        logger.info("Adding Father to Family : {}", family);

        familyService.addFatherToFamily(family,father);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/child/{id}").buildAndExpand(father.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
}

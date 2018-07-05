package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Child {
    private String firstName;
    private String pesel;
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String secondName;
    private String sex;
    private Date birthDate;
    private Long familyId;

}
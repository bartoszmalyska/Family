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
public class Father {
    private Date birthDate;
    private String firstName;
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String pesel;
    private String secondName;
    private Long familyId;

}
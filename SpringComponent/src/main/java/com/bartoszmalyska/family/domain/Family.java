package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Family {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;

}
package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Child {
    private @NonNull String firstName;
    private @NonNull String pesel;
    @Id @GeneratedValue
    private int id;
    private String secondName;
    private @NonNull String sex;

}
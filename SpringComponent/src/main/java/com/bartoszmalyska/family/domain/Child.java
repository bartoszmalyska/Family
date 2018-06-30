package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Child {
    @Id @GeneratedValue
    private @NonNull String firstName;
    private @NonNull String pesel;
    private int id;
    private String secondName;
    private @NonNull String sex;

}
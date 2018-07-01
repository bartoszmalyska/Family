package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Family {
    @Id @GeneratedValue
    private int id;
    private @NonNull Father father;
    private Child[] children;

}
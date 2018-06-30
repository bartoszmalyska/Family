package com.bartoszmalyska.family.domain;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Father {
    private @NonNull Date birthDate;
    private @NonNull String firstName;
    private int id;
    private @NonNull String pesel;
    private String secondName;

}
package com.bartoszmalyska.family.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FamModel {
    private Family family;
    private Father father;
    private List<Child> children;
}

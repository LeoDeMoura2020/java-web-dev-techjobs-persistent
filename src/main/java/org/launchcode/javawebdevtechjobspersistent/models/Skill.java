package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 5, max = 100, message="Skill needs to be within 100 characters")
    public String descriptionOfSkill;

    public Skill() {
    }
}
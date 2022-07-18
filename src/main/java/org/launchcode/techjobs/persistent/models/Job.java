package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManytoMany
    private List<Skill> skills = new ArrayList<>();

    //@Id
    //@GeneratedValue
    //private int id;

    //private String name;

   // private String employer;
    //private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, List someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    //public String getName() {
       // return name;
    //}

    //public void setName(String name) {
       // this.name = name;
   // }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //public String getSkills() {
       // return skills;
    //}
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }
}

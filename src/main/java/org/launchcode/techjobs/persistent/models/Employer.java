package org.launchcode.techjobs.persistent.models;

import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(min = 4, max = 100, message = "Location must be between 4 and 100 characters")
    @NotNull
    private String location;

    @OneToMany
    @JoinColumn(name = "jobs_id")
    private List<Job> jobs= new ArrayList();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){}
}

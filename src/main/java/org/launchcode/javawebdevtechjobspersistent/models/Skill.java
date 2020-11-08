package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 5, max = 100, message="Skill needs to be within 100 characters")
    public String description;

    @ManyToMany (mappedBy = "skills")
    private List<Job> jobs;


    public Skill() {
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
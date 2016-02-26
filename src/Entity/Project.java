/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Steffen
 */
@Entity

public class Project implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    String name;
    String description;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date created;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date lastModified;

    @ManyToMany
    private Collection<ProjectUser> user;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;
}

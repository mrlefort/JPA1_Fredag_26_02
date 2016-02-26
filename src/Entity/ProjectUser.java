/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 *
 * @author Steffen
 */
@Entity

@NamedQuery (name = "ProjectUser.findAll", query = "SELECT c FROM ProjectUser c")
public class ProjectUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public ProjectUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectUser(String userName, String email, Date created) {
        this.userName = userName;
        this.email = email;
        this.created = created;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Collection<Project> getProject() {
        return project;
    }

    public void setProject(Collection<Project> project) {
        this.project = project;
    }
    
    

    String userName;

    String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date created;

    @ManyToMany
    private Collection<Project> project;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.ProjectUser;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Steffen
 */
public class Facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA1");
    EntityManager em = emf.createEntityManager();

    public void createUser(String name, String email, Date createdDate) {

        try {
            ProjectUser p1 = new ProjectUser(name, email, createdDate);
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }

    public void getAllUsers() {
       // TypedQuery<ProjectUser> q1 = em.createQuery("SELECT c FROM ProjectUser c", ProjectUser.class); // Hvis min query ikke er lang, og kun skal bruges 1 sted. Dynamic query.
       
        TypedQuery<ProjectUser> q2 = em.createNamedQuery("ProjectUser.findAll", ProjectUser.class);     //NamedQuery er god hvis man skal kalde den query fra flere steder. 
                                                                                                        //eller hvis den er meget lang så behøver jeg kun skrive den et sted (i entity class)
        List<ProjectUser> results = q2.getResultList();
        
        for (ProjectUser result : results) {
            System.out.println(result.getUserName());
            
        }

    }
}

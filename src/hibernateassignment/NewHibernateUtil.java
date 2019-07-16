/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateassignment;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Baltic
 */
public class NewHibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            try {
                // Create the SessionFactory from standard (hibernate.cfg.xml) 
                // config file.
                Configuration configuration = new Configuration();

     // Pass hibernate configuration file
     configuration.configure("hibernate.cfg.xml");

     // Since version 4.x, service registry is being used
     ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
     applySettings(configuration.getProperties()).build(); 

     // Create session factory instance
      sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Throwable ex) {
                ex.printStackTrace();
                System.exit(1);
            }
        }
        
        return sessionFactory;
    }
}


package br.pro.jtcerqueira.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory = createSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	private static SessionFactory createSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
				
				ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
				
				SessionFactory factory = conf.buildSessionFactory(registry);
				
				return factory;
				
		}catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}
}

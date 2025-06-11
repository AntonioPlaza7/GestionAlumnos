package com.academia.util;

import com.academia.model.Alumno;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error al crear el SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

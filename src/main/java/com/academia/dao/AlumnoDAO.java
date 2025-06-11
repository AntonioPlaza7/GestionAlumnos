package com.academia.dao;

import com.academia.model.Alumno;
import com.academia.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlumnoDAO {

    public void saveAlumno(Alumno alumno) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public Alumno getAlumnoById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Alumno.class, id);
        }
    }

    public void updateAlumno(Alumno alumno) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteAlumno(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Alumno alumno = session.get(Alumno.class, id);
            if (alumno != null) session.remove(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
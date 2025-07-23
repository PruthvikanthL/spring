package com.Hibernate.testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            StudentDetails s1=new StudentDetails();
            s1.setSid(102);
            s1.setSname("Rangu");
            s1.setTech("Java");

        Configuration config= new Configuration();

        config.addAnnotatedClass(com.Hibernate.testing.StudentDetails.class);

        config.configure("hibernate.cfg.xml");

        SessionFactory factory=config.buildSessionFactory();

        Session session=factory.openSession();

        Transaction transaction=session.beginTransaction();

        session.remove();

        transaction.commit();

        session.close();

        factory.close();

        }
    }

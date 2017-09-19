package com.scp.hospital;

import org.hibernate.*;

import org.hibernate.cfg.AnnotationConfiguration;

public class TestHospital {

	public static void main(String[] args) {

		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Hospital h = new Hospital(2, "Renu", "Sonvane");
		session.save(h);

		Dental d = new Dental("root_canel", 5000);
		session.save(d);

		tx.commit();

		session.close();
		System.out.println("Successfully Execute");

	}
}
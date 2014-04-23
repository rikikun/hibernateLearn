package com.augmentis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainApp {
	private SessionFactory factory;
	private Session session;

	public MainApp() {
		Configuration config = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class);
		factory = config.buildSessionFactory();

	}

	public void addEmployee(Employee em) {
		session = factory.openSession();
		session.beginTransaction();
		// Transaction
		@SuppressWarnings("unchecked")
		List<Department> list = session.createCriteria(Department.class)
				.add(Restrictions.eq("dept_name", "Account")).list();
		for (Department d : list) {
			em.setDepartment(d);
			session.save(em);
		}

		session.getTransaction().commit();
		session.close();
	}

	// public static void main(String args[]) {
	// Configuration config = new Configuration()
	// .configure("hibernate.cfg.xml")
	// .addAnnotatedClass(Employee.class)
	// .addAnnotatedClass(Department.class);
	// SessionFactory factory = config.buildSessionFactory();
	// Session session=factory.openSession();
	// @SuppressWarnings("unchecked")
	// List<Department> list = session.createCriteria(Department.class)
	// .add(Restrictions.eq("dept_name", "Account")).list();
	// session.beginTransaction();
	// for(Department d:list){
	// session.save(new Employee("kor", "Than", 12222, d));
	// }
	// session.getTransaction().commit();
	// session.close();
	// }

}

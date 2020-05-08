package edu.gmu.swe;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.codejava.hibernate.Record;

public class RecordManager {
	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		sessionFactory.close();
	}

	protected void insert(Record record) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(record);
		
		session.getTransaction().commit();
		session.close();
	}

	protected List<Record> read() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Record> criteria = builder.createQuery(Record.class);
		Root<Record> variableRoot = criteria.from(Record.class);
	    criteria.select(variableRoot);
		List<Record> result = session.createQuery(criteria).getResultList();
		session.getTransaction().commit();
		session.close();
		return result;
	}

	protected void update() {
		// code to modify a book
	}

	protected void delete() {
		// code to remove a book
	}

	public static void main(String[] args) {
		
	}
}

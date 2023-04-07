package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.emp;

public class empdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(emp e)
	{
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
	}
//	public void update(String name,String role)
//	{
//		emp e=entityManager.find(emp.class,name);
//		e.setRole(role);
//		entityTransaction.begin();
//		entityManager.merge(e);
//		entityTransaction.commit();
//	
//	}
//public void fetch(String name)
//{
//	emp e=entityManager.find(emp.class,name);
//	System.out.println(e);
//		
//			}
	
//	public List<emp>fetchall()
//	{
//		Query q=entityManager.createQuery("select a from emp a");
//		List<emp>l1=q.getResultList();
//		return l1;
//		
//	}
	
}


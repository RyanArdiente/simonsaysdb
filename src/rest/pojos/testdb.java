package rest.pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testdb
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SimonPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Score e = em.find(Score.class, 1);
		e.setName("RCA");
		e.setScore(1000000);
		
		//		em.remove(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}

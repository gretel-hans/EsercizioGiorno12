package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Concerto;
import model.Evento;
import model.PartitaDiCalcio;
import utils.GenereConcerto;
import utils.JpaUtil;

public class EventoDAO implements IEventoDAO {
	
//	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelazioniJPA");
//	static EntityManager em = emf.createEntityManager();

	@Override
	public void save(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(ev);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!"+e);
		} finally {
			em.close();
		}
	}

	@Override
	public Evento getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento evt =  em.find(Evento.class, id);
			em.getTransaction().commit();
			return evt;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su ricerca!!");
		} finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(ev);
			em.getTransaction().commit();
			System.out.println("Evento cancellato dal DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}

	}

	@Override
	public void update(Evento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(ev);
			em.getTransaction().commit();
			System.out.println("Evento modificato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su modfica!!");
		} finally {
			em.close();
		}

	}

	@Override
	public List<Evento> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			//Query q = em.createQuery("SELECT ev FROM Evento ev");
			// Named Query
			Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
	
	}
	
	@Override
	public List<Concerto> getConcertiInStreaming() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT c FROM Concerto AS c WHERE c.inStreaming=true");
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			return q.getResultList();
		} finally {
			em.close();
		}
	
	}
	
	@Override
	public List<Concerto> getConcertiPerGenere(GenereConcerto e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT c FROM Concerto AS c WHERE c.genere= :genere_passato");
			return q.setParameter("genere_passato", e).getResultList();
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			
		} finally {
			em.close();
		}
	
	}
	
	@Override
	public List<PartitaDiCalcio> getPartiteVinteInCasa() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT p FROM PartitaDiCalcio AS p WHERE p.nGolSquadraDiCasa > p.numero_gol_s_ospiti ");
			return q.getResultList();
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			
		} finally {
			em.close();
		}
	
	}

	@Override
	public List<PartitaDiCalcio> getPartiteVinteInTrasferta() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT p FROM PartitaDiCalcio AS p WHERE p.nGolSquadraDiCasa < p.numero_gol_s_ospiti ");
			return q.getResultList();
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			
		} finally {
			em.close();
		}
	
	}
	
	@Override
	public List<PartitaDiCalcio> getPartitePareggiate() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// Dynamic Query 
			Query q = em.createQuery("SELECT p FROM PartitaDiCalcio AS p WHERE p.nGolSquadraDiCasa = p.numero_gol_s_ospiti ");
			return q.getResultList();
			// Named Query
			//Query q = em.createNamedQuery("findAllEventi");
			
		} finally {
			em.close();
		}
	
	}
	
}

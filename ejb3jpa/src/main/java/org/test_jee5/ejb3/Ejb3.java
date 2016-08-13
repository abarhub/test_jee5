package org.test_jee5.ejb3;

import org.apache.log4j.Logger;
import org.test_jee5.ejb4.IEjb4;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Local(IEjb3.class)
@Stateful
public class Ejb3 implements IEjb3 {

	public static final Logger LOGGER = Logger.getLogger(Ejb3.class);

	@PersistenceContext
	private EntityManager em;

	//private int nb;
	@EJB
	private IEjb4 compteur;

	public void ajoute(String nom, String prenom) {
		LOGGER.info("Debut ajout : '" + nom + "'/'" + prenom + "'");
		Personne p = new Personne();
		p.setNom(nom);
		p.setPrenom(prenom);
		em.merge(p);
		LOGGER.info("Fin ajout");
	}

	public int getNb() {
		return compteur.getCompteur();
	}

}
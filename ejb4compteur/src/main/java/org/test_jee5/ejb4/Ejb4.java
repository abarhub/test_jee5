package org.test_jee5.ejb4;

import org.apache.log4j.Logger;

import javax.ejb.Local;
import javax.ejb.Singleton;

@Local(IEjb4.class)
@Singleton
public class Ejb4 {

	public static final Logger LOGGER = Logger.getLogger(Ejb4.class);

	private int compteur;

	//@PostContruct
	public void init(){

	}

	public int getCompteur(){
		int n;
		n=compteur;
		LOGGER.info("compteur="+n);
		compteur++;
		return n;
	}
}
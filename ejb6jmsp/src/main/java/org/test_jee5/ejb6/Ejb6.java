package org.test_jee5.ejb6;

import org.apache.log4j.Logger;

import javax.ejb.Local;
import javax.ejb.Singleton;

@Local(IEjb6.class)
@Singleton
public class Ejb6 {

	public static final Logger LOGGER = Logger.getLogger(Ejb6.class);


	public void ajoute(String str){

	}
}
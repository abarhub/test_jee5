package org.test_jee5.appwebjsf;

import org.apache.log4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by Alain on 16/07/2016.
 */
@RequestScoped
@Named
public class Test1 {

	public static final Logger LOGGER = Logger.getLogger(Test1.class);

	private int nb;

	public int getAndAdd(){
		LOGGER.info("appel getAndAdd");
		return nb++;
	}
}

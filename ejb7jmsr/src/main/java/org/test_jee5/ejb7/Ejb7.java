package org.test_jee5.ejb7;

import javax.ejb.Local;
import javax.ejb.Stateful;
import org.apache.log4j.Logger;

@Local(IEjb7.class)
@Stateful
public class Ejb7 {


	public static final Logger LOGGER = Logger.getLogger(Ejb7.class);

}
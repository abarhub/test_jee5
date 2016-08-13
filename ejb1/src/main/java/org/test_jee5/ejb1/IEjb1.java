package org.test_jee5.ejb1;

import javax.ejb.Local;

/**
 * Created by Alain on 10/07/2016.
 */
@Local
public interface IEjb1 {
	String getValeurTest();
}

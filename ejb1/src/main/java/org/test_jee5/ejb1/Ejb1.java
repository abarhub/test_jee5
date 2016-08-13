package org.test_jee5.ejb1;

import javax.ejb.Local;
import javax.ejb.Stateless;

//@EJB(name = "Ejb1",beanInterface = IEjb1.class)
@Local(IEjb1.class)
@Stateless
public class Ejb1 implements IEjb1 {

	@Override
	public String getValeurTest(){
		return "AbcDef";
	}
}
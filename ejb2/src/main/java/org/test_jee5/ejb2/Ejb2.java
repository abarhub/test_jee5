package org.test_jee5.ejb2;

import org.test_jee5.ejb1.IEjb1;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Local(IEjb2.class)
//@Stateful
@Singleton
public class Ejb2 implements IEjb2{

	private AtomicLong compteur=new AtomicLong(0);

	private Random random=new SecureRandom();

	@EJB
	private IEjb1 ejb1;

	public long getAndIncrement(){
		long res=compteur.getAndIncrement();
		return res;
	}

	public String getValue(){
		return ejb1.getValeurTest();
	}

	public int getIntRandom(){
		return random.nextInt();
	}
}
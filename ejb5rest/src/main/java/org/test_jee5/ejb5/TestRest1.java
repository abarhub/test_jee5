package org.test_jee5.ejb5;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Alain on 15/07/2016.
 */
@Path("users")
public class TestRest1 {

	@GET
	public String methode1(){
		return "Coucou";
	}
}

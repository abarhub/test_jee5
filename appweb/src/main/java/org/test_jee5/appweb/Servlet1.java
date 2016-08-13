package org.test_jee5.appweb;

import org.test_jee5.ejb1.IEjb1;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alain on 10/07/2016.
 */
@WebServlet( name="Inscription", urlPatterns = "/inscription" )
public class Servlet1 extends HttpServlet {

	@EJB//(name = "Ejb1")
	//private Ejb1 localEJB;
	private IEjb1 localEJB;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Ajouter un listener
		/*request.addAsyncListener(new MyAsyncListener())
		// Definition du timeout programatiquement
		request.setAsyncTimeout(10000);
		// Execution asynchrone et récupération du context
		AsyncContext context = request.startAsync(request, response);*/

		response.getWriter().println("Coucou : "+localEJB.getValeurTest());
	}

}

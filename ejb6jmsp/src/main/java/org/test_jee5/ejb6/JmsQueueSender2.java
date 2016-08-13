package org.test_jee5.ejb6;

import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 * Created by Alain on 16/07/2016.
 */
@ApplicationScoped
@Named
public class JmsQueueSender2 {

	public static final Logger LOGGER = Logger.getLogger(JmsQueueSender2.class);

	@Inject
	private JMSContext jmsContext;

	@Resource(mappedName = "java:/jboss/exported/jms/queue/TestQ")
	private Queue queue;

	public void sendMessage(String s){
		LOGGER.info("envoie du message : "+s);
		jmsContext.createProducer().send(queue,s);
		LOGGER.info("message envoie");
	}

	public void sendMessage2(){
		sendMessage("Salut");
	}

	public String messageDefaut(){
		LOGGER.info("Message defaut");
		return "Coucou";
	}
}

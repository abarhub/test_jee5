package org.test_jee5.ejb7;

import org.apache.log4j.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by Alain on 16/07/2016.
 */
@MessageDriven(name="TestQ",activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup",
			propertyValue = "java:/jboss/exported/jms/queue/TestQ"),
		@ActivationConfigProperty(propertyName = "destinationType",
				propertyValue = "javax.jms.Queue")
})
public class JmsRecever implements MessageListener {

	public static final Logger LOGGER = Logger.getLogger(JmsRecever.class);

	@Override
	public void onMessage(Message var1) {
		LOGGER.info("Reception d'un message...");
		try {
			String message=var1.getBody(String.class);
			LOGGER.info("Message recu : "+message);
		} catch (JMSException e) {
			LOGGER.error("Erreur:"+e.getLocalizedMessage(),e);
		}
	}
}

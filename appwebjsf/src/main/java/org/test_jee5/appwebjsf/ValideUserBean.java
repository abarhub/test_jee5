package org.test_jee5.appwebjsf;

import org.apache.log4j.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Alain on 16/07/2016.
 */
@SessionScoped
@Named(value = "valideUser")
public class ValideUserBean implements Serializable {

	public static final Logger LOGGER = Logger.getLogger(ValideUserBean.class);

	public String valide(UserBean user){
		LOGGER.info("Debut validation");
		String urlOK="test4res";
		String urlErreur="";
		String urlResultat=urlOK;
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<UserBean>> constraintViolations = validator.validate(user);

		if (constraintViolations.size() > 0 ) {
			String message="";
			for (ConstraintViolation<UserBean> contraintes : constraintViolations) {

				message+=contraintes.getRootBeanClass().getSimpleName()+
						"." + contraintes.getPropertyPath() + " " + contraintes.getMessage();

			}
			LOGGER.error("Erreur de validation : "+message);

			urlResultat=urlErreur;
		} else {
			LOGGER.info("Validation OK");
		}
		LOGGER.info("Fin validation");

		return urlResultat;
	}
}

package org.test_jee5.appwebjsf;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Alain on 16/07/2016.
 */
public class ChaineInterditValidator implements ConstraintValidator<ChaineInterdite, String> {

	private String chaineInterdite;

	@Override
	public void initialize(ChaineInterdite chaineInterdit) {
		chaineInterdite=chaineInterdit.chaine();
	}

	@Override
	public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
		if(s!=null&&chaineInterdite!=null){
			if(s.contains(chaineInterdite)){
				return false;
			}
		}
		return true;
	}
}

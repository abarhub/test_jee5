package org.test_jee5.appwebjsf;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Alain on 16/07/2016.
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = {ChaineInterditValidator.class})
@Documented
public @interface ChaineInterdite {

	String message() default "Chaine interdite";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String chaine() default "a";
}

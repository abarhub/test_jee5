package org.test_jee5.appwebjsf;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Alain on 16/07/2016.
 */
@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {

	@NotNull
	@Size(max = 20)
	@Pattern(regexp = ".*@laposte\\.net$")
	private String email;

	@NotNull
	@Size(max = 20)
	@ChaineInterdite
	private String nom;

	@NotNull
	@Size(max = 20)
	@ChaineInterdite(chaine = "b")
	private String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

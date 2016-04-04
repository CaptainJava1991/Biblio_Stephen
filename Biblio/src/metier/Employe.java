package metier;

import java.util.Date;

public class Employe extends Utilisateur {
	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	
	public Employe(String nom, String prenom, String sexe, Date date){
		super(nom, prenom, sexe, date);
	}

}

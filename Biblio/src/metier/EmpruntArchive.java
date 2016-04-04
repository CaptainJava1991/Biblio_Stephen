package metier;

import java.util.Date;

public class EmpruntArchive {
	private Date dateRestitution;
	private Date dateEmprunt;
	private Utilisateur utilisateur;
	private Exemplaire exemplaire;
	
	public EmpruntArchive(Date dateRestitution, Date dateEmprunt, 
			Utilisateur u, Exemplaire ex){
		
		this.dateRestitution = dateRestitution;
		this.dateEmprunt = dateEmprunt;
		this.utilisateur = u;
		this.exemplaire = ex;
	}
}

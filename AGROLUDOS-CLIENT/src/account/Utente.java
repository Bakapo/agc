package account;

import java.util.ArrayList;
import java.util.List;

import competizione.Competizione;

public abstract class Utente extends Account {

	List<Competizione> competizioni;
	
	public Utente(String surname, String name, String email) {
		super(surname, name, email);
		competizioni = new ArrayList<Competizione>();
	}
	
	public void addCompetizione(Competizione competizione){
		this.competizioni.add(competizione);
	}
}

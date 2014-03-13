package account;

import java.util.List;

import competizione.Competizione;

public class Manager extends Account {

	List<Competizione> competizioni;

	/**
	 * Crea un'istanza di Manager.
	 * @param surname - il cognome del manager
	 * @param name - il nome del manager
	 * @param email - l'indirizzo email del manager
	 */
	public Manager(String surname, String name, String email) {
		super(surname, name, email);
	}
	
	/**
	 * Aggiunge una competizione a quelle gestite dal manager.
	 * @param competizione - la competizione da aggiungere
	 */
	public void addCompetizione(Competizione competizione){
		this.competizioni.add(competizione);
	}
}

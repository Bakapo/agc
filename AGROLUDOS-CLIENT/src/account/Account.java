package account;

public abstract class Account {
	
	String surname, name, email;

	/**
	 * Crea una istanza di Account.
	 * @param surname - il cognome dell'utente
	 * @param name - il nome dell'utente
	 * @param email - l'email dell'utente
	 */
	public Account(String surname, String name, String email) {
		this.name = name;
		this.surname = surname;
		if (!isValidemail(email)) throw new InvalidAddressException("Indirizzo email non valido");
		this.email = email;
	}
	
	private static boolean isValidemail(String email){
		return email.contains("@") && email.contains(".");
	}
	
	
}

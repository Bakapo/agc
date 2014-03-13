package account;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import competizione.Competizione;

public class Partecipante extends Utente {

	String codFiscale;
	String address;
	int birthYear;
	Sesso sex;
	int numTesseraSanitaria;
	File SRC;
	
	public Partecipante(String surname, String name, String email) {
		super(surname, name, email);
}

}

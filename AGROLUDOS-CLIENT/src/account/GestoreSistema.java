package account;

public class GestoreSistema extends Account {

	private static GestoreSistema instance = null;
	private GestoreSistema(String surname, String name, String email) {
		super(surname, name, email);
		// TODO Auto-generated constructor stub
	}
	
	public static GestoreSistema getInstance() {
        if (instance == null) 
            instance = new GestoreSistema("Gestore", "Sistema", "agroludos@gmail.com");
        return instance;
	}
}

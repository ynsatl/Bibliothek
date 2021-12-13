import java.util.Scanner;

public class Sachbearbeiter extends Nutzer {

	private long adminID;
	private int berechtigung;

	public Sachbearbeiter(long adminID, int berechtigung) {
		super("Admin","Admin","aktiv");
		this.adminID = adminID;
		this.berechtigung = berechtigung;
	}

	public void nutzerBearbeiten() {
		Scanner suche = new Scanner(System.in);
		for(int i = 0; i < Nutzerlist.size();i++){
			//if(Nutzerlist.get())
		}
		throw new UnsupportedOperationException();
	}

	public void nutzerErstellen() throws Exception {
		System.out.println("Neuen Nutzer erstellen...");
		System.out.println("Bitte geben Sie einen Namen ein: ");
		Scanner name = new Scanner(System.in);
		System.out.println("Welche Rolle hat der Nutzer?: ");
		Scanner rolle = new Scanner(System.in);
		System.out.println("Wie ist der Status?: ");
		Scanner status = new Scanner(System.in);
		System.out.println("Ist der Nutzer volljährig Y/N ?");
		Scanner check18 = new Scanner(System.in);
		String vcheck = check18.toString();

		if (vcheck.equals("N")){
			throw new Exception("Es werden nur volljäöhrige Nutzer akzeptiert.");
		}

		if (vcheck.equals("Y")){
			Nutzer neuerNutzer= new Nutzer(name.toString(),rolle.toString(),status.toString());
			addNutzer(neuerNutzer);
			System.out.println("Nutzer erstellt");
		}

		else throw new Exception("Ungültige Eingabe");
		throw new UnsupportedOperationException();
	}

	public void bibliothekSuche() {
		// TODO - implement Sachbearbeiter.bibliothekSuche
		throw new UnsupportedOperationException();
	}

	public void bibliothekBearbeiten() {
		// TODO - implement Sachbearbeiter.bibliothekBearbeiten
		throw new UnsupportedOperationException();
	}

}
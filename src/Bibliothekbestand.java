import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class Bibliothekbestand {

	private ArrayList<Buch> Datenbank;
	private int anzahlAusleihbareMedien;
	private List inventar;

	protected Bibliothekbestand(){
		Buch softwareEngineering = new Buch("Software Engineering", "Hollunder", true,1,1);
		Buch mathe1 = new Buch("Mathe Grundlagen", "Hollunder", true,1,2);
		Buch zweiterWeltkrieg = new Buch("die Geschichte über den 2. Weltkrieg", "Hollunder", true,1,3);
		Buch english = new Buch("Englisch für Informatiker", "Hollunder", true,1,4);
		Buch rechnewesen = new Buch("Rechenwesen für Dummies", "Hollunder", true,1,5);
		Buch deutsch1 = new Buch("Deutsch lernen einfach gemacht ", "Hollunder", true,1,6);
		Buch physik1 = new Buch("Physik zum Lernen", "Hollunder", true,1,7);
		Buch harry1 = new Buch("Harry Potter und der Stein der Weisen", "Hollunder", true,1,8);
		Buch harry2 = new Buch("Harry Potter und die Kammer des Schreckens", "Hollunder", true,1,9);
		Buch killer = new Buch("DER KRUZIFIX KILLER", "Chris Carter", true,1,9);
		Datenbank.add(softwareEngineering);
		Datenbank.add(mathe1);
		Datenbank.add(zweiterWeltkrieg);
		Datenbank.add(english);
		Datenbank.add(rechnewesen);
		Datenbank.add(deutsch1);
		Datenbank.add(physik1);
		Datenbank.add(harry1);
		Datenbank.add(harry2);
		Datenbank.add(killer);

	}

	public Buch TitelSuche(String titel) throws Exception {
		for (int i = 0; i < Datenbank.size(); i++) {
			if (titel == Datenbank.get(i).getTitel())
				return Datenbank.get(i);
		}
		throw new Exception("Buch wurde nicht gefunden.");
	}


	public Buch AutorSuche(String vorname, String nachname) {
		for (int i = 0; i < Datenbank.size(); i++) {
			if (vorname +" "+nachname == Datenbank.get(i).getAutor())
				return Datenbank.get(i);
		}
		throw new UnsupportedOperationException();
	}

	public Buch ISBNsuche(long ISBN) {
		for (int i = 0; i < Datenbank.size(); i++) {
			if (ISBN == Datenbank.get(i).getISBN())
				return Datenbank.get(i);
		}
		throw new UnsupportedOperationException();
	}


	public void BuchHinzufügen(Buch neu, long adminID) {
		Datenbank.add(neu);
		throw new UnsupportedOperationException();
	}

	public void WunschAntrag() {
		System.out.println("Wunsch wurde erfolgreich übermittelt.");
		throw new UnsupportedOperationException();
	}

}
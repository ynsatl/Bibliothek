import java.util.List;

public class Ausleihkonto {

	private int kontostand;
	private int mahnungen;
	private List ausgelieheneMedien;
	private List reservierteMedien;
	private long id;
	private Buch ausgelieheneInhalte;
	private Fakultät fakultät;

	public void zugriffBibliothek() {
		// TODO - implement Ausleihkonto.zugriffBibliothek
		throw new UnsupportedOperationException();
	}

	public void mahnungenAnsehen() {
		// TODO - implement Ausleihkonto.mahnungenAnsehen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Mahnungen
	 */
	public void kontoLöschen(int Mahnungen) {
		// TODO - implement Ausleihkonto.kontoLöschen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Dauer
	 * @param checkReservierung
	 */
	public void verlängerung(int Dauer, boolean checkReservierung) {
		// TODO - implement Ausleihkonto.verlängerung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ausleihID
	 */
	public void verlustmedlung(long ausleihID) {
		// TODO - implement Ausleihkonto.verlustmedlung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ausleihID
	 * @param schaden
	 */
	public void schadenMeldung(long ausleihID, String schaden) {
		// TODO - implement Ausleihkonto.schadenMeldung
		throw new UnsupportedOperationException();
	}

	public void rückgabe() {
		// TODO - implement Ausleihkonto.rückgabe
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Anliegen
	 */
	public void support(String Anliegen) {
		// TODO - implement Ausleihkonto.support
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Passwort
	 */
	public void benutzerkontoLöschen(String Passwort) {
		// TODO - implement Ausleihkonto.benutzerkontoLöschen
		throw new UnsupportedOperationException();
	}

}
public class DVD extends AusleihbaresMedium {

	private long dvdID;
	private int laufzeitMin;


	public DVD(String titel, String autor, boolean verfügbarkeit, int exemplare,long ISBN) {
		super(titel, autor, verfügbarkeit, exemplare, ISBN);
	}
}
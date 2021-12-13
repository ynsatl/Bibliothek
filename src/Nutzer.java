import javax.naming.Name;
import java.util.ArrayList;

public class Nutzer {

	private String name;
	private String rolle;
	private String status;
	private boolean ü18;
	protected static ArrayList<Nutzer> Nutzerlist;

	protected static Nutzer getEntry(int i){
		return Nutzerlist.get(i);
	}

	/*protected static String getnutzerName(){
		return Nutzerlist.get
	}*/

	protected static void addNutzer(Nutzer neu){
		Nutzerlist.add(neu);
	}

	public Nutzer(String name, String rolle, String status) {
		this.name = name;
		this.rolle = rolle;
		this.status = status;
	}

	public String getName(){
		return this.name;
	}

	public String getRolle(){
		return this.rolle;
	}

	public String getStatus(){
		return this.status;
	}
	/**
	 * LOLLOLOLOLOLOLOL
	 * @param name
	 * @param passwort
	 */
	public void login(String name, String passwort) {
		// TODO - implement Nutzer.login
		throw new UnsupportedOperationException();
	}

}
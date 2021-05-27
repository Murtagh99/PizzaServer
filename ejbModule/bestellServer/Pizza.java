package bestellServer;

import java.io.Serializable;
import java.util.ArrayList;

public class Pizza extends Gericht implements Serializable  {
	private int groesse;

	public Pizza(int nummer, String bezeichnung, double preis, ArrayList<String> zutaten, int groesse) {
		super(nummer, bezeichnung, preis, zutaten);
		this.groesse = groesse;
		// TODO Auto-generated constructor stub
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

}

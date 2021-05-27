package bestellServer;

import java.io.Serializable;
import java.util.ArrayList;

public class Pasta extends Gericht implements Serializable{
	private String nudel;

	public Pasta(int nummer, String bezeichnung, double preis, ArrayList<String> zutaten, String nudel) {
		super(nummer, bezeichnung, preis, zutaten);
		this.nudel = nudel;
		// TODO Auto-generated constructor stub
	}

}

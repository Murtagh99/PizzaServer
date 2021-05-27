package bestellServer;

import java.io.Serializable;
import java.util.ArrayList;

public class Gericht implements Serializable {

	private int nummer;
	private String bezeichnung;
	private double preis;
	private ArrayList<String> zutaten;
	
	public Gericht(int nummer, String bezeichnung, double preis, ArrayList<String> zutaten) {
		super();
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.zutaten = zutaten;
	}
	
	
	
}

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
	
	public void zutatEntfernen(String zutat) {
		zutaten.remove(zutat);
	}
	
	public void zutatHinzufuegen(String zutat) {
		zutaten.add(zutat);
		preis += 0.5;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public ArrayList<String> getZutaten() {
		return zutaten;
	}

	public void setZutaten(ArrayList<String> zutaten) {
		this.zutaten = zutaten;
	}
	
}

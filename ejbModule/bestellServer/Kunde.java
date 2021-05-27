package bestellServer;

import java.io.Serializable;

public class Kunde implements Serializable {

	private String name;
	private String vorname;
	private String adresse;
	private String eMail;
	private String telefonnummer;
	
	public Kunde(String name, String vorname, String adresse, String eMail, String telefonnummer) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.eMail = eMail;
		this.telefonnummer = telefonnummer;
	}

	public Kunde() {
		super();
		this.name = "";
		this.vorname = "";
		this.adresse = "";
		this.eMail = "";
		this.telefonnummer = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
}

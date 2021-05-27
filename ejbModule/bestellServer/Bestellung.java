package bestellServer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Stateful
@LocalBean
@Entity
public class Bestellung implements BestellungRemote, BestellungLocal, Serializable {

	@Id
	@GeneratedValue
	private int id;
	private Bestellstatus bestellstatus;
	private String zahlungsart;
	private ArrayList<Gericht> gerichte;
	private Kunde kunde;
	private boolean lieferung;
	private LocalDateTime bestellzeit;
	
    @PostConstruct
    public void init() {
    	bestellstatus = Bestellstatus.AENDERBAR;
    	gerichte = new ArrayList<Gericht>();
    }

    public void bestellungAbschlieﬂen(String zahlungsart, String name, String vorname, String adresse, String eMail, String telefonnummer, boolean lieferung, LocalDateTime bestellzeit) {
    	this.bestellstatus = Bestellstatus.WARTEND;
    	this.zahlungsart = zahlungsart;
    	this.kunde = new Kunde(name, vorname, adresse, eMail, telefonnummer);
    	this.lieferung = lieferung;
    	this.bestellzeit = bestellzeit;
    	//TODO persist into database
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bestellstatus getBestellstatus() {
		return bestellstatus;
	}

	public void setBestellstatus(Bestellstatus bestellstatus) {
		this.bestellstatus = bestellstatus;
	}

	public String getZahlungsart() {
		return zahlungsart;
	}

	public void setZahlungsart(String zahlungsart) {
		this.zahlungsart = zahlungsart;
	}

	public ArrayList<Gericht> getGerichte() {
		return gerichte;
	}

	public void setGerichte(ArrayList<Gericht> gerichte) {
		this.gerichte = gerichte;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public boolean isLieferung() {
		return lieferung;
	}

	public void setLieferung(boolean lieferung) {
		this.lieferung = lieferung;
	}

	public LocalDateTime getBestellzeit() {
		return bestellzeit;
	}

	public void setBestellzeit(LocalDateTime bestellzeit) {
		this.bestellzeit = bestellzeit;
	}

}

enum Bestellstatus {
	AENDERBAR,
	WARTEND,
	IN_BEARBEITUNG,
	IN_AUSLIEFERUNG,
	ABHOLBEREIT,
	ABGESCHLOSSEN,
}

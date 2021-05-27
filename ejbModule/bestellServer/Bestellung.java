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

}

enum Bestellstatus {
	AENDERBAR,
	WARTEND,
	IN_BEARBEITUNG,
	IN_AUSLIEFERUNG,
	ABHOLBEREIT,
	ABGESCHLOSSEN,
}

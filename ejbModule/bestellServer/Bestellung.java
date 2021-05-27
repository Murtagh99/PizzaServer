package bestellServer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

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
	private ArrayList<Object> gerichte;
	private Object kunde;
	private boolean lieferung;
	private LocalDate bestellzeit;
	
    public Bestellung() {
        // TODO Auto-generated constructor stub
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

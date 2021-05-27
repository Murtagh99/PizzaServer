package bestellServer;

import java.time.LocalDateTime;

import javax.ejb.Remote;

@Remote
public interface BestellungRemote {
	public int getId();
	public void bestellungAbschlieﬂen(String zahlungsart, String name, String vorname, String adresse, String eMail, String telefonnummer, boolean lieferung, LocalDateTime bestellzeit);
}

package bestellServer;

import javax.ejb.Remote;

@Remote
public interface BestellungRemote {
	public int getId();
}

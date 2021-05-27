package bestellServer;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Bestellung
 */
@Stateful
@LocalBean
public class Bestellung implements BestellungRemote, BestellungLocal {

    /**
     * Default constructor. 
     */
    public Bestellung() {
        // TODO Auto-generated constructor stub
    }

}

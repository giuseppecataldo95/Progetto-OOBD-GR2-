package Risorse.MieEccezioni;

public class CarrelloVuotoException extends Exception {

	
	
	public String getMessage() {
		String Message = "ERRORE: Carrello Vuoto";
		return Message;
	}
}

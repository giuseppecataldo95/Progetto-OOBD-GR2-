package Risorse.MieEccezioni;

public class CarrelloNonTrovatoException extends Exception {

	public CarrelloNonTrovatoException(){
		
	}
	
	public String getMessage() {
		String Message = "ERRORE: Carrello non trovato";
		return Message;
	}

}//

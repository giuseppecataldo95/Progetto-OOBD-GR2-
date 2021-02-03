package Risorse.MieEccezioni;

public class TesseraNonTrovataException extends Exception {

	public TesseraNonTrovataException(){
		
	}
	
	public String getMessage() {
		String Message = "ERRORE: Tessera non trovata";
		return Message;
	}

}//

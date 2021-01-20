package Risorse.App;

import java.sql.Date;

public class ConvertiCBInData {
	
	private String Giorno;
	private String Mese;
	private String Anno;
	
	public ConvertiCBInData(String Giorno, String Mese, String Anno) {
		this.Giorno = Giorno;
		this.Mese = Mese;
		this.Anno = Anno;
	}
	
	
	
	
	public Date Converti(){
		
		String separatore = "-";
		if(Mese.equals("GENNAIO"))
			Mese = "01";
		if(Mese.equals("FEBBRAIO"))
			Mese = "02";
		if(Mese.equals("MARZO"))
			Mese = "03";
		if(Mese.equals("APRILE"))
			Mese = "04";
		if(Mese.equals("MAGGIO"))
			Mese = "05";	
		if(Mese.equals("GIUGNO"))
			Mese = "06";	
		if(Mese.equals("LUGLIO"))
			Mese = "07";
		if(Mese.equals("AGOSTO"))
			Mese = "08";
		if(Mese.equals("SETTEMBRE"))
			Mese = "09";
		if(Mese.equals("OTTOBRE"))
			Mese = "10";
		if(Mese.equals("NOVEMBRE"))
			Mese = "11";
		if(Mese.equals("DICEMBRE"))
			Mese = "12";
	    String DataCompleta	= (Anno.concat(separatore).concat(Mese).concat(separatore).concat(Giorno));
		
		Date DataFormattata = Date.valueOf(DataCompleta);
		return DataFormattata;
	}

}

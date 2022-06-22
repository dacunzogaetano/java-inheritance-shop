package jana60;

public class Cuffie extends Prodotto{
	
	/* Lo shop gestisce diversi tipi di prodotto:
	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
	
	//attributi cuffie	
	
	private String colore;
	private Boolean wireless;
	
	//costruttori cuffie
	
	public Cuffie(int codice, String nome, String marca, float prezzo, float iva, String colore) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
	}
	
	//getters and setters
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public Boolean getWireless() {
		return wireless;
	}

	public void setWireless(Boolean wireless) {
		this.wireless = wireless;
	}
	
	//metodo che eredita il concatenamento di prodotto ed aggiunge i due attributi della classe Cuffie
			@Override
			  public String toString() {
			    return super.toString() + ". Il colore delle cuffie è " + colore + ".";
			  }

}

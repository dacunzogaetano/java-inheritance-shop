package jana60;

public class Cuffie extends Prodotto{
	
	/* Lo shop gestisce diversi tipi di prodotto:
	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
	
	//attributi cuffie	
	
	private String colore;
	private boolean wireless;
	
	//costruttori cuffie
	
	public Cuffie(int codice, String nome, String marca, float prezzo, float iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	//getters and setters
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean getWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	//metodo che eredita il concatenamento di prodotto ed aggiunge i due attributi della classe Cuffie
			@Override
			  public String toString() {
				String cuffieString = super.toString() + " - " +  getColore();
				if (wireless) {
					cuffieString += " - cuffie Wireless.";
				} else {
					cuffieString += " - cuffie Cablate";
				}
			    return cuffieString;
			  }

}

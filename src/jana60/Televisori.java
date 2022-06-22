package jana60;

public class Televisori extends Prodotto{
	
	/* Lo shop gestisce diversi tipi di prodotto:
	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
	
	//attributi televisori
	
	private  float dimensioni;
	private Boolean smart;
	
	//costruttori televisori
	
	public Televisori(int codice, String nome, String marca, float prezzo, float iva, float dimensioni) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
	}
	
	//getters and setters 
	
	public float getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(float dimensioni) {
		this.dimensioni = dimensioni;
	}

	public Boolean getSmart() {
		return smart;
	}

	public void setSmart(Boolean smart) {
		this.smart = smart;
	}
	
	//metodo che eredita il concatenamento di prodotto ed aggiunge i due attributi della classe Televisori
		@Override
		  public String toString() {
		    return super.toString() + ". Le dimensioni del televisore sono " + dimensioni + " cm.";
		  }
}

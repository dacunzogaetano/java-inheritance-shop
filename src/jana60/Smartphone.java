package jana60;

public class Smartphone extends Prodotto{
	
	/* Lo shop gestisce diversi tipi di prodotto:
		- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
		- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
		- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
	
	//attributi Smartphone
	
	private int codiceIMEI;
	private int memoria;
	
	//costruttori televisori
	
	public Smartphone(int codice, String nome, String marca, float prezzo, float iva, int codiceIMEI, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
	}
	
	//getters and setters
	
	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	//metodo che eredita il concatenamento di prodotto ed aggiunge i due attributi della classe Smartphone
	@Override
	  public String toString() {
	    return super.toString() + " - " + getMemoria() + "GB.";
	  }
	

}

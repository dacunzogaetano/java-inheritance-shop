package jana60;

public class Televisori extends Prodotto{
	
	/* Lo shop gestisce diversi tipi di prodotto:
	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
	
	//attributi televisori
	
	private  float dimensioni;
	private boolean smart;
	
	//costruttori televisori
	
	public Televisori(int codice, String nome, String marca, float prezzo, float iva, float dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
	
	//getters and setters 
	
	public float getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(float dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	

	  @Override
	  public String toString() {
	    String televisoreString = super.toString() + " - " + getDimensioni();
	    if (smart) {
	      televisoreString += " - smart";
	    }
	    return televisoreString;
	  }

		
}
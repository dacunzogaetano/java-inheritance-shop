package java.shop;

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

}

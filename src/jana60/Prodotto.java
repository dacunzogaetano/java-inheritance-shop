package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	/* Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
		- codice (numero intero)
		- nome
		- marca
		- prezzo
		- iva 
	Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
		- il codice prodotto sia accessibile solo in lettura
		- gli altri attributi siano accessibili sia in lettura che in scrittura
		- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato */
	
	
	//attributi
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private float iva;	
		
	//costruttori
	public Prodotto(int codice, String nome, String marca, float prezzo, float iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	//getters and setters
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}


	public float getIva() {
		return iva;
	}


	public void setIva(float iva) {
		this.iva = iva;
	}
	
	
	
	//metodi per calcolare e formattare il prezzo
	public double calcolaPrezzo() {
		float prezzoFinale = prezzo + prezzo * iva;
		return prezzoFinale;
		
	}
	
	public String formattaPrezzo() {
	    DecimalFormat df = new DecimalFormat("0.00€");
	    return df.format(calcolaPrezzo());
	  }
	
	//metodo per concatenare
	@Override
	  public String toString() {
	    return "Il codice del prodotto è " + codice + ", il nome del prodotto è " + nome + ", di marca " + marca + ", prezzo di listino " + prezzo +
	    		"€, l'iva è " + iva + "%, il prezzo finale quindi è " + formattaPrezzo();
	    		
	  }
	
	
	
}

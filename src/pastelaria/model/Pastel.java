package pastelaria.model;

import java.time.ZonedDateTime;
import java.util.Timer;

public class Pastel extends Receita{

	private String tamanho;
	
	public Pastel(String nome, String modoPreparo, String timeStamp,String tamanho) {
		super(nome, modoPreparo, timeStamp);
		// TODO Auto-generated constructor stub
		this.tamanho=tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("o tamanho e: " + this.getTamanho());
		
	}

}

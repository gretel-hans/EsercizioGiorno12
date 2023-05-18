package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import utils.GenereConcerto;

@Entity
public class Concerto extends Evento {

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private GenereConcerto genere;
	
	@Column(nullable = false, name="in_streaming")
	private boolean inStreaming;

	
	public Concerto() {
		super();
	}

	public Concerto(GenereConcerto genere, boolean inStreaming) {
		super();
		this.genere = genere;
		this.inStreaming = inStreaming;
	}

	public GenereConcerto getGenere() {
		return genere;
	}

	public void setGenere(GenereConcerto genere) {
		this.genere = genere;
	}

	public boolean isInStreaming() {
		return inStreaming;
	}

	public void setInStreaming(boolean inStreaming) {
		this.inStreaming = inStreaming;
	}

	@Override
	public String toString() {
		return "Concerto [genere=" + genere + ", inStreaming=" + inStreaming + "]";
	}
	
	
	
}

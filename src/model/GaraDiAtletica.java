package model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class GaraDiAtletica extends Evento {

	@Column(nullable = false, name="lista_partecipanti")
	@ManyToMany
	private List<Persona> listaPartecipanti;
	

	@ManyToOne
	private Persona vincitore;

	
	
	
	public GaraDiAtletica() {
		super();
	}

	public GaraDiAtletica(List<Persona> listaPartecipanti, Persona vincitore) {
		super();
		this.listaPartecipanti = listaPartecipanti;
		this.vincitore = vincitore;
	}

	public List<Persona> getListaPartecipanti() {
		return listaPartecipanti;
	}

	public void setListaPartecipanti(List<Persona> listaPartecipanti) {
		this.listaPartecipanti = listaPartecipanti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}

	@Override
	public String toString() {
		return "GaraDiAtletica [listaPartecipanti=" + listaPartecipanti + ", vincitore=" + vincitore + "]";
	}
	
	
	
	
}

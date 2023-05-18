package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento {

	@Column(nullable = false,  name = "squadra_di_casa")
	private String squadraDiCasa;
	
	@Column(nullable = false, name = "squadra_ospite")
	private String squadraOspite;
	
	@Column(name = "squadra_vincente")
	private String squadraVincente;
	
	@Column(nullable = false, name = "numero_gol_s_casa")
	private Integer nGolSquadraDiCasa;
	
	@Column(nullable = false, name = "numero_gol_s_ospiti")
	private Integer nGolSquadraOspite;
	
	
	

	public PartitaDiCalcio() {
		super();
	}

	public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente,
			Integer nGolSquadraDiCasa, Integer nGolSquadraOspite) {
		super();
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.nGolSquadraDiCasa = nGolSquadraDiCasa;
		this.nGolSquadraOspite = nGolSquadraOspite;
	}

	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}

	public void setSquadraDiCasa(String squadraDiCasa) {
		this.squadraDiCasa = squadraDiCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}

	public String getSquadraVincente() {
		return squadraVincente;
	}

	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}

	public Integer getnGolSquadraDiCasa() {
		return nGolSquadraDiCasa;
	}

	public void setnGolSquadraDiCasa(Integer nGolSquadraDiCasa) {
		this.nGolSquadraDiCasa = nGolSquadraDiCasa;
	}

	public Integer getnGolSquadraOspite() {
		return nGolSquadraOspite;
	}

	public void setnGolSquadraOspite(Integer nGolSquadraOspite) {
		this.nGolSquadraOspite = nGolSquadraOspite;
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraDiCasa=" + squadraDiCasa + ", squadraOspite=" + squadraOspite
				+ ", squadraVincente=" + squadraVincente + ", nGolSquadraDiCasa=" + nGolSquadraDiCasa
				+ ", nGolSquadraOspite=" + nGolSquadraOspite + "]";
	}
	
	
}

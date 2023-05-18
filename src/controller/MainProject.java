package controller;

import java.time.LocalDate;

import dao.PersonaDAO;
import dao.EventoDAO;
import dao.LocationDAO;
import dao.PartecipazioniDAO;
import model.Evento;
import model.Location;
import model.Partecipazione;
import model.PartitaDiCalcio;
import model.Persona;
import utils.Sesso;
import utils.StatoPartecipazione;
import utils.TipoEvento;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDAO p= new PersonaDAO();
		Persona p1 =(new Persona("Marta", "Bianchi", "m.bianchi@icloud.com", LocalDate.of(1999, 05, 20), Sesso.FEMMINA));
		//p.save(p1);
		
		//LocationDAO l= new LocationDAO();
		//Location l1=new Location("SottoSopra","Parma");
		//l.getById(1);
		EventoDAO e= new EventoDAO();
		//Evento e1 =new Evento("Serata MamboLosco", LocalDate.of(2023, 07, 10), null, TipoEvento.PUBBLICO, 100, l.getById(1));
		PartitaDiCalcio pdc=new PartitaDiCalcio("Inter", "Milan", "Inter", 1, 0);
		e.save(pdc);
		
		//PartecipazioniDAO pa= new PartecipazioniDAO();
		//Partecipazione pa1= new Partecipazione(p.getById(1),e.getById(1),StatoPartecipazione.CONFERMATA);
		//pa.save(pa1);
		
		//System.out.println(p.getById(1));
	}

}

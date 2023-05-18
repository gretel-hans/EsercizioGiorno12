package dao;

import java.util.List;

import model.Concerto;
import model.Evento;
import model.PartitaDiCalcio;
import utils.GenereConcerto;

public interface IEventoDAO {
	
	public void save(Evento e);
	public Evento getById(int id);
	public void delete(Evento e);
	public void update(Evento e);
	public List<Evento> getAll();
	public List<Concerto> getConcertiInStreaming();
	public List<Concerto> getConcertiPerGenere (GenereConcerto genere);
	public List<PartitaDiCalcio> getPartiteVinteInCasa();
	public List<PartitaDiCalcio> getPartiteVinteInTrasferta();
	public List<PartitaDiCalcio> getPartitePareggiate();
}

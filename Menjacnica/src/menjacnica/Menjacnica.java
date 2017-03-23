package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.InterfejsMenjacnica;

public class Menjacnica implements InterfejsMenjacnica{
	private LinkedList<Kurs> kursnaLista = new LinkedList<Kurs>();

	@Override
	public void dodajKurs(Kurs k) {
		if(k==null) {
			throw new RuntimeException("Morate uneti kurs da biste ga dodali u kursnu listu");
		} else {
			kursnaLista.add(k);
		}
	}

	@Override
	public void obrisiKurs(Kurs k) {
	}

	@Override
	public Kurs vratiKurs(Valuta v, GregorianCalendar datum) {
		return null;
	}

}

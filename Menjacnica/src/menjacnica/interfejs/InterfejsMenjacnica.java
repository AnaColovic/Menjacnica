package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface InterfejsMenjacnica {
	public void dodajKurs(Kurs k);
	public void obrisiKurs(Kurs k);
	public Kurs vratiKurs(Valuta v, GregorianCalendar datum);
}

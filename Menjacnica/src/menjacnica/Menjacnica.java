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
		kursnaLista.remove(k);
	}

	@Override
	public Kurs vratiKurs(Valuta v, GregorianCalendar datum) {
		for(int i=0;i<kursnaLista.size();i++){
			if(kursnaLista.get(i).getValuta().equals(v) && kursnaLista.get(i).getDatum().equals(datum)){
				return kursnaLista.get(i);
			}
		}
		return null;
	}

}

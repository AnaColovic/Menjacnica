package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar datum;
	private Valuta valuta;
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni==0) throw new RuntimeException("Prodajni kurs ne sme biti 0.");
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni==0) throw new RuntimeException("Kupovni kurs ne sme biti 0.");
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji==0) throw new RuntimeException("Srednji kurs ne sme biti 0.");
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum.before(new GregorianCalendar())) throw new RuntimeException("Datum ne sme da se odnosi na proslost.");
		this.datum = datum;
	}
	public Valuta getValuta() {
		return valuta;
	}
	public void setValuta(Valuta valuta) {
		if(valuta==null) throw new RuntimeException("Morate uneti valutu.");
		this.valuta = valuta;
	}
	@Override
	public String toString() {
		return "Kurs [prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji + ", datum=" + datum
				+ ", valuta=" + valuta + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	
}

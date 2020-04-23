package hh.swd20.warehouseproject.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Paikka {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paikkaId;
	private String numero;
	private int kplmaara;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "osastoId")
	private Osasto osasto;
	
	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paikkaId")
	private Tuote tuote;
	
	public Paikka() {}

	public Long getPaikkaId() {
		return paikkaId;
	}

	public void setPaikkaId(Long paikkaId) {
		this.paikkaId = paikkaId;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getKplmaara() {
		return kplmaara;
	}

	public void setKplmaara(int kplmaara) {
		this.kplmaara = kplmaara;
	}

	public Osasto getOsasto() {
		return osasto;
	}

	public void setOsasto(Osasto osasto) {
		this.osasto = osasto;
	}

	public Tuote getTuote() {
		return tuote;
	}

	public void setTuote(Tuote tuote) {
		this.tuote = tuote;
	}

	@Override
	public String toString() {
		return "Paikka [numero=" + numero + ", kplmaara=" + kplmaara + ", osasto=" + osasto + ", tuote=" + tuote + "]";
	}

	public Paikka(String numero, int kplmaara, Osasto osasto, Tuote tuote) {
		super();
		this.numero = numero;
		this.kplmaara = kplmaara;
		this.osasto = osasto;
		this.tuote = tuote;
	}

	
}
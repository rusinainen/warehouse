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


// HUOM ! HUOM ! Kaikki linkit lätkä-luokkaan toistaiseksi poistettu


@Entity
public class Tuote {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nimi, valmistaja, koko, vari;
	private double hinta;
	private String latka;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "osastoId")
	private Osasto osasto;

	@JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paikkaId")
	private Paikka paikka;
		
	/*
	@OneToOne
	@JoinColumn(name = "viivakoodi")
	private Latka latka;
	  
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
	private List<Status> statukset;
	*/
	
	public Tuote() {}
	
	public Tuote(String nimi, String valmistaja, String koko, String vari, double hinta, Osasto osasto) {
		super();
		this.nimi = nimi;
		this.valmistaja = valmistaja;
		this.koko = koko;
		this.vari = vari;
		this.hinta = hinta;
		this.osasto = osasto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getValmistaja() {
		return valmistaja;
	}

	public void setValmistaja(String valmistaja) {
		this.valmistaja = valmistaja;
	}

	public String getKoko() {
		return koko;
	}

	public void setKoko(String koko) {
		this.koko = koko;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public Osasto getOsasto() {
		return osasto;
	}

	public void setOsasto(Osasto osasto) {
		this.osasto = osasto;
	}

	public Paikka getPaikka() {
		return paikka;
	}

	public void setPaikka(Paikka paikka) {
		this.paikka = paikka;
	}
	
	
	public String getLatka() {
		return latka;
	}

	public void setLatka(String latka) {
		this.latka = latka;
	}
	

	@Override
	public String toString() {
		return "Tuote [id=" + id + ", nimi=" + nimi + ", valmistaja=" + valmistaja + ", koko=" + koko + ", vari=" + vari
				+ ", hinta=" + hinta + ", osasto=" + this.getOsasto() + ", paikka=" + this.getPaikka() +"]";
	}

	/*

	public List<Status> getStatukset() {
		return statukset;
	}

	public void setStatukset(List<Status> statukset) {
		this.statukset = statukset;
	}
	*/


	
}	
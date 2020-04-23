package hh.swd20.warehouseproject.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Latka {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long latkaId;
	private String viivakoodi;
	private int kplmaara;
	private String tuote;
	
	/*
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "latka")
	private Tuote tuote;
	
	*/
	
	public Latka () {}

	public Long getLatkaId() {
		return latkaId;
	}

	public void setLatkaId(Long latkaId) {
		this.latkaId = latkaId;
	}

	public String getViivakoodi() {
		return viivakoodi;
	}

	public void setViivakoodi(String viivakoodi) {
		this.viivakoodi = viivakoodi;
	}

	public int getKplmaara() {
		return kplmaara;
	}

	public void setKplmaara(int kplmaara) {
		this.kplmaara = kplmaara;
	}

	/*
	public Tuote getTuote() {
		return tuote;
	}
	
	public Tuote getTuote(String viivakoodi) {
		return tuote;
	}

	public void setTuote(Tuote tuote) {
		this.tuote = tuote;
	}
	 */
	
	@Override
	public String toString() {
		return "Latka [latkaId=" + latkaId + ", viivakoodi=" + viivakoodi + ", kplmaara=" + kplmaara + ", tuote="
				+ tuote + "]";
	}

	public Latka(String viivakoodi, int kplmaara, String tuote) {
		super();
		this.viivakoodi = viivakoodi;
		this.kplmaara = kplmaara;
		this.tuote = tuote;
	}
	
}
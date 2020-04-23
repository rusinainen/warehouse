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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Osasto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long osastoId;
	private String nimi;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "osasto")
	private List<Tuote> tuotteet;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "osasto")
	private List<Paikka> paikat;
	
	public Osasto() {}

	public Long getOsastoId() {
		return osastoId;
	}

	public void setOsastoId(Long osastoId) {
		this.osastoId = osastoId;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public List<Tuote> getTuotteet() {
		return tuotteet;
	}

	public void setTuotteet(List<Tuote> tuotteet) {
		this.tuotteet = tuotteet;
	}

	@Override
	public String toString() {
		return "Osasto [nimi=" + nimi + "]";
	}

	public Osasto(String nimi) {
		super();
		this.nimi = nimi;
	}
}

/*package hh.swd20.warehouseproject.domain;

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
	public class Status {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String status;
		
		@JsonManagedReference
		@ManyToOne
		@JoinColumn(name = "tuoteId")
		private Tuote tuote;
		  
		
		
		public Status () {}
		
	}
		
*/
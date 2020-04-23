package hh.swd20.warehouseproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.warehouseproject.domain.Tuote;
import hh.swd20.warehouseproject.domain.TuoteRepository;
import hh.swd20.warehouseproject.domain.Latka;
import hh.swd20.warehouseproject.domain.LatkaRepository;
import hh.swd20.warehouseproject.domain.Osasto;
import hh.swd20.warehouseproject.domain.OsastoRepository;
import hh.swd20.warehouseproject.domain.Paikka;
import hh.swd20.warehouseproject.domain.PaikkaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class WarehouseprojectApplication {
	private static final Logger log = LoggerFactory.getLogger(WarehouseprojectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(WarehouseprojectApplication.class, args);
	}

	
	//PAikka ja lätkä on poistettu. Lisää myöhemmin
	@Bean
	public CommandLineRunner demo(TuoteRepository trepository, OsastoRepository orepository, PaikkaRepository prepository, LatkaRepository lrepository ) {
	return (args) -> {
		
		//Osastot lisätty 100%
		Osasto o1 = new Osasto("Dresses");
		Osasto o2 = new Osasto("Tops");
		Osasto o3 = new Osasto("Bottoms");
		Osasto o4 = new Osasto("Shoes");
		Osasto o5 = new Osasto("Bags");
		
		orepository.save(o1);
		orepository.save(o2);
		orepository.save(o3);
		orepository.save(o4);
		orepository.save(o5);
		
		//Paikat on luotu
		Paikka p1 = new Paikka("A1", 3, orepository.findByNimi("Dresses").get(0), null);
		Paikka p2 = new Paikka("A2", 2, orepository.findByNimi("Dresses").get(0), null);
		Paikka p3 = new Paikka("A3", 1, orepository.findByNimi("Dresses").get(0), null);
						
		Paikka p4 = new Paikka("B1", 15, orepository.findByNimi("Bottoms").get(0), null);
		Paikka p5 = new Paikka("B2", 22, orepository.findByNimi("Bottoms").get(0), null);
		Paikka p6 = new Paikka("B3", 2, orepository.findByNimi("Bottoms").get(0), null);
						
		prepository.save(p1);
		prepository.save(p2);
		prepository.save(p3);
		prepository.save(p4);
		prepository.save(p5);
		prepository.save(p6);

		
		//Ensimmäisen tuotteen luonti
		Tuote t1 = new Tuote("Bathrobe", "Sable", "XS", "white", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t2 = new Tuote("Bathrobe", "Sable", "S", "white", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t3 = new Tuote("Bathrobe", "Sable", "M", "white", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t4 = new Tuote("Bathrobe", "Sable", "L", "white", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t5 = new Tuote("Bathrobe", "Sable", "XL", "white", 72.00, orepository.findByNimi("Dresses").get(0));
		//Eka variaatio
		Tuote t6 = new Tuote("Bathrobe", "Sable", "S", "pink", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t7 = new Tuote("Bathrobe", "Sable", "M", "pink", 72.00, orepository.findByNimi("Dresses").get(0));
		Tuote t8 = new Tuote("Bathrobe", "Sable", "L", "pink", 72.00, orepository.findByNimi("Dresses").get(0));
		

		//Tokan tuotteen luonti
		Tuote t9 = new Tuote("Athletic pants", "Mable", "XS", "red", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t10 = new Tuote("Athletic pants", "Mable", "S", "red", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t11 = new Tuote("Athletic pants", "Mable", "M", "red", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t12 = new Tuote("Athletic pants", "Mable", "L", "red", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t13 = new Tuote("Athletic pants", "Mable", "XL", "red", 88.00, orepository.findByNimi("Bottoms").get(0));
		//toka variaatio 
		Tuote t15 = new Tuote("Athletic pants", "Mable", "S", "blue", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t16 = new Tuote("Athletic pants", "Mable", "M", "blue", 88.00, orepository.findByNimi("Bottoms").get(0));
		Tuote t14 = new Tuote("Athletic pants", "Mable", "L", "blue", 88.00, orepository.findByNimi("Bottoms").get(0));

		trepository.save(t1);
		trepository.save(t2);
		trepository.save(t3);
		trepository.save(t4);
		trepository.save(t5);
		trepository.save(t6);
		trepository.save(t7);
		trepository.save(t8);
		trepository.save(t9);
		trepository.save(t10);
		trepository.save(t11); 
		trepository.save(t12);
		trepository.save(t13);
		trepository.save(t14);
		trepository.save(t15);
		trepository.save(t16);
		
		//Lätkat lisätty
		Latka l1 = new Latka("Z1", 2, "Bathrobe");
		Latka l2 = new Latka("Z2", 3, "Bathrobe");
		
		/*
		Latka l3 = new Latka("Z3", 5, trepository.findByNimi("Bathrobe").get(2));
		Latka l4 = new Latka("Z4", 4, trepository.findByNimi("Bathrobe").get(3));
		Latka l5 = new Latka("Z5", 1, trepository.findByNimi("Bathrobe").get(4));
		*/ 
		
		lrepository.save(l1);
		lrepository.save(l2);
		/*
		lrepository.save(l3);
		lrepository.save(l4);
		lrepository.save(l5);
		*/
	
		log.info("nayta kaikki tuotteet");
		for (Tuote tuote : trepository.findAll()) {
			log.info(tuote.toString());
					}
		
		log.info("nayta kaikki osastot");
		for (Osasto osasto : orepository.findAll()) {
			log.info(osasto.toString());
					}
		
		log.info("nayta kaikki hyllypaikat");
		for (Paikka paikka : prepository.findAll()) {
			log.info(paikka.toString());
					}
		
		log.info("nayta kaikki latkat");
		for (Latka latka : lrepository.findAll()) {
			log.info(latka.toString());
					}
		
				};
			}
		}


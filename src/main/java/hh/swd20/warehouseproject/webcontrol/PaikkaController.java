/*package hh.swd20.warehouseproject.webcontrol;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.swd20.warehouseproject.domain.Osasto;
import hh.swd20.warehouseproject.domain.OsastoRepository;
import hh.swd20.warehouseproject.domain.Paikka;
import hh.swd20.warehouseproject.domain.PaikkaRepository;
import hh.swd20.warehouseproject.domain.Tuote;
import hh.swd20.warehouseproject.domain.TuoteRepository;
import hh.swd20.warehouseproject.domain.Latka;
import hh.swd20.warehouseproject.domain.LatkaRepository;


@Controller
public class PaikkaController {
	
	Scanner input = new Scanner(System.in); 
	
	@Autowired
	private TuoteRepository trepository;
	
	@Autowired
	private OsastoRepository orepository;
	
	@Autowired
	private PaikkaRepository prepository;
	
	@Autowired
	private LatkaRepository lrepository;
	
	//Skannaa viivakoodin
	public String getViivakoodi(Latka viivakoodi) {
		return viivakoodi.toString();
	}
	
	public void HyllytysOhjelma (Latka latka) {
		//Kysyy viivakoodin
		System.out.println("Anna lätkän viivakoodi:");
		String viivakoodi = input.nextLine();
		
		//Palauttaa tuotteen nimen, joka on yhdistetty lätkään
		
		
		
		//Hakee paikoista tuotteen paikan
		
		
		System.out.println("Tuotteen paikka on " + "paikan nimi");
		
		
	}
	
	public String addTuote(Model model, Model model2) {
		model.addAttribute("tuote", new Tuote());
		model2.addAttribute("latka", new Latka());
		model.addAttribute("osastot", orepository.findAll());
		model2.addAttribute("latkat", lrepository.findAll());
		return "vastaanota";
		}
    
}

*/
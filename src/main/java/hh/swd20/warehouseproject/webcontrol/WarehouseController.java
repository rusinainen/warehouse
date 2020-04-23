package hh.swd20.warehouseproject.webcontrol;

import java.util.List;
import java.util.Optional;

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
public class WarehouseController {
	
	@Autowired
	private TuoteRepository trepository;
	
	@Autowired
	private OsastoRepository orepository;
	
	@Autowired
	private PaikkaRepository prepository;
	
	@Autowired
	private LatkaRepository lrepository;
	
	//Etusivu toimii
    @RequestMapping(value= {"/", "/index"}, method=RequestMethod.GET)
    public String greetingForm(Model model) {
        return "hello";
    }
    
    //Ei toimi 
    @RequestMapping(value="/vastaanota")
	public String addTuote(Model model) {
		model.addAttribute("tuote", new Tuote());
		model.addAttribute("osastot", orepository.findAll());
		return "vastaanota";
		}
    
	//TOIMII
	@RequestMapping(value = "/savet", method = RequestMethod.POST)
			public String saveTuote(Tuote tuote){
			trepository.save(tuote);
			return "redirect:tuotelista";
			}
	
		@RequestMapping(value = "/savep", method = RequestMethod.POST)
		public String savePaikka(Paikka paikka){
		prepository.save(paikka);
		return "redirect:paikkalista";
		}
	
	/*
	 // Ei toimi vielä 
	//Tuotteiden keräys 
	@RequestMapping(value="/keraa")
	public String KeraaTuote(Model model) {
		return "keraa";
		}
	
	 //EI toimi vielä 
	// Tuotteiden hyllytys 
	@RequestMapping(value="/hyllyta")
	public String HyllytaTuote(Model model) {
		return "hyllyta";
		}
		
	*/
	
    // Muokkaa tuotteen saldoa hyllyssä
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editSaldo(@PathVariable("id") Long paikkaId, Model model) {
    	model.addAttribute("paikka", prepository.findById(paikkaId));
    	model.addAttribute("osastot", orepository.findAll());
    	return "muokkaapaikkaa";
    }   
    
     //Toimii
    //Listaa tuotteet
    @RequestMapping(value= {"/tuotelista"}, method=RequestMethod.GET)
    public String TuoteListaus(Model model) {
    	model.addAttribute("tuotteet", trepository.findAll());
        return "tuotelista";
    }
    
     // Toimii 
    //Listaa osastot
    @RequestMapping(value= {"/osastolista"}, method=RequestMethod.GET)
    public String OsastoListaus(Model model) {
    	model.addAttribute("osastot", orepository.findAll());
        return "osastolista";
    }
    
     //Toimii 
    //Listaa paikat
    @RequestMapping(value= {"/paikkalista"}, method=RequestMethod.GET)
    public String PaikkaListaus(Model model) {
    	model.addAttribute("paikat", prepository.findAll());
        return "paikkalista";
    }
    
    // Tee vielä html-sivu
    //Listaa lätkät
    @RequestMapping(value= {"/latkalista"}, method=RequestMethod.GET)
    public String LatkaListaus(Model model) {
    	model.addAttribute("latkat", lrepository.findAll());
        return "latkalista";
    }
    
     //Toimii
	//Osasto by Id REST:nä
    @RequestMapping(value="/osasto/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Osasto> findOsastoRest(@PathVariable("id") Long osastoId) {	
    	return orepository.findById(osastoId);
    }  
    
     //Toimii, mutta koska tuotteita ei ole, ei myöskään näy mitään
    //Osasto by Id
  	 @RequestMapping(value = "/osastolista/{id}", method = RequestMethod.GET)
  	    public String naytaOsasto(@PathVariable("id") Long osastoId, Model model) {
  	    model.addAttribute("osastot", orepository.findById(osastoId));
  	    return "naytaosasto";
  	    } 
  	 
  	  // Toimii
     //Hakee lätkät RESTINÄ
   	@RequestMapping(value="/latkat", method = RequestMethod.GET)
   	public @ResponseBody List<Latka> LatkaListRest() {
   	return (List<Latka>) lrepository.findAll();
   	}
  	 
  	 //Toimii
    //Hakee tuotteet REST:nä
  	@RequestMapping(value="/tuotteet", method = RequestMethod.GET)
  	public @ResponseBody List<Tuote> tuoteListRest() {
  	return (List<Tuote>) trepository.findAll();
  	}
  	
  	 //Toimii
  	//Hakee osastot REST:nä
  	@RequestMapping(value="/osastot", method = RequestMethod.GET)
  	public @ResponseBody List<Osasto> osastoListRest() {
  	return (List<Osasto>) orepository.findAll();
  	}
  	
  	 //Toimii 
  	//Poista tuote
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTuote(@PathVariable("id") Long tuoteId, Model model) {
    	trepository.deleteById(tuoteId);
        return "redirect:../tuotelista";
    }  
    
}
package tn.reclamation.service;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.reclamation.entities.Depenses;
import tn.reclamation.entities.Revenus;
import tn.reclamation.entities.ServiceFinancier;
import tn.reclamation.repository.DepenseRepository;
import tn.reclamation.repository.RevenueRepository;
import tn.reclamation.repository.ServiceFinancierRepository;
=======
=======
>>>>>>> Stashed changes
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.reclamation.entities.Depenses;
import tn.reclamation.entities.Prixinscriptions;
<<<<<<< Updated upstream
=======
import tn.reclamation.entities.Projet;
>>>>>>> Stashed changes
import tn.reclamation.entities.Revenus;
import tn.reclamation.entities.ServiceFinancier;
import tn.reclamation.entities.User;
import tn.reclamation.repository.DepenseRepository;
import tn.reclamation.repository.PrixinscriptionsRepository;
<<<<<<< Updated upstream
import tn.reclamation.repository.RevenueRepository;
import tn.reclamation.repository.ServiceFinancierRepository;
import tn.reclamation.repository.UserRepository;
>>>>>>> Stashed changes
=======
import tn.reclamation.repository.ProjetRepository;
import tn.reclamation.repository.RevenueRepository;
import tn.reclamation.repository.ServiceFinancierRepository;
import tn.reclamation.repository.UserRepository;
>>>>>>> Stashed changes

@Service
public class ServiceFinancierService {
	@Autowired
	ServiceFinancierRepository serviceFinancierRepository;
@Autowired
DepenseRepository depenseRepo;
@Autowired
RevenueRepository revenuRepo;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
@Autowired
ProjetRepository projetRepo;

>>>>>>> Stashed changes
@Autowired
UserRepository userRepo;
@Autowired
PrixinscriptionsRepository prixRepository;
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

	public ServiceFinancier ajouterServiceFinancier(ServiceFinancier r) {
		return serviceFinancierRepository.save(r);
		
	}

	public List<ServiceFinancier> ListServiceFinancier(){
		return serviceFinancierRepository.findAll();
	}


	public void supprimerServiceFinancier(Long idServiceFinancier) {
		ServiceFinancier r = serviceFinancierRepository.findById(idServiceFinancier).orElse(null);
		
		serviceFinancierRepository.delete(r);
	}
	
	public void updateServiceFinancier(ServiceFinancier serviceFinancier, Long idServiceFinancier) {
		
		ServiceFinancier sf= serviceFinancierRepository.findById(idServiceFinancier).orElse(null);	
		
		sf.setIdF(idServiceFinancier);
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		sf.setDepensesF(serviceFinancier.getDepensesF());
		sf.setConsommationF(serviceFinancier.getConsommationF());
=======
		sf.setTotaleDepenses(serviceFinancier.getTotaleDepenses());
		sf.setTotaleRevenues(serviceFinancier.getTotaleRevenues());
>>>>>>> Stashed changes
=======
		sf.setTotaleDepenses(serviceFinancier.getTotaleDepenses());
		sf.setTotaleRevenues(serviceFinancier.getTotaleRevenues());
>>>>>>> Stashed changes
		serviceFinancierRepository.save(sf);
		
	}	
	
	
	public ServiceFinancier getSFbyId(Long idServiceFinancier) {
		return serviceFinancierRepository.findById(idServiceFinancier).orElse(null);	
	}
	
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	public float EtatFinance() {
		
		List<Depenses> listdepenses = depenseRepo.findAll();
		List<Revenus> listRevenus = revenuRepo.findAll();
		float sommeDepense=0;
		float sommeRevenus=0;
		
		for(Depenses d :listdepenses) {
			sommeDepense+= d.getConsommationeau()+d.getConsommationelectricite()+d.getMaintenanceRestaurant()+d.getSalaireProf();
	}
	System.out.println(sommeDepense);
		for(Revenus r :listRevenus) {
			sommeRevenus+= r.getAbonnementFoyer()+r.getAbonnementRestaurant()+r.getProjets()+r.getScolariteEtud();
	}
		System.out.println(sommeRevenus);

	return sommeRevenus-sommeDepense;
	
	
=======
=======
>>>>>>> Stashed changes
	public float EtatFinanceByYear() {
		Date currentSqlDate = new Date(System.currentTimeMillis());
		List<Depenses> listdepenses = depenseRepo.findAll();
		float sommeDepense=0;
		float sommeRevenus=0;
<<<<<<< Updated upstream
	
=======
		float sommeprojets=0;
>>>>>>> Stashed changes
		int nbrAbonnéRestau=0;
		int nbrAbonnéFoyer=0;
		List<User> listuser = userRepo.findAll();
		List<Prixinscriptions> prixinscriptions = prixRepository.findAll();
<<<<<<< Updated upstream
=======
		List<Projet> projets = projetRepo.findAll();
>>>>>>> Stashed changes
		
		Prixinscriptions prix = new Prixinscriptions();
		
		for(Prixinscriptions p : prixinscriptions) {
			if(p.getDate().getYear()==currentSqlDate.getYear()) {
				prix = p;
			}
		}
<<<<<<< Updated upstream

		
=======
		for (Projet p : projets) {
			sommeprojets+= p.getPrixProjet();
			
			}
		System.out.println("/////////"+sommeprojets);
>>>>>>> Stashed changes
		for (User u : listuser) {
			if(u.getAbonneRestaurant().booleanValue()) {
				nbrAbonnéRestau++;
			}
			if(u.getAbonneFoyer().booleanValue()) {
				nbrAbonnéFoyer++;
			}
		}
			sommeRevenus+=listuser.size()*prix.getPrixScolarité()+nbrAbonnéFoyer*prix.getPrixAbonnementFoyer()+
<<<<<<< Updated upstream
					nbrAbonnéRestau*prix.getPrixAbonnementRestaurant();
=======
					nbrAbonnéRestau*prix.getPrixAbonnementRestaurant() + sommeprojets;
>>>>>>> Stashed changes
	
		for(Depenses d :listdepenses) {
			sommeDepense+= d.getConsommationeau()+d.getConsommationelectricite()+d.getMaintenanceRestaurant()+d.getSalaireProf();
	}
	
	
	return sommeRevenus-sommeDepense;
	
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
	
	
	
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
	
	@Scheduled(fixedRate = 1000)
	//@Scheduled(cron = "* * * * */12 *")
	private void AugmenterPrixScolarité() {
		Date currentSqlDate = new Date(System.currentTimeMillis());
		Prixinscriptions prix = new Prixinscriptions();
		List<Prixinscriptions> prixinscriptions = prixRepository.findAll();

		for(Prixinscriptions p : prixinscriptions) {
			if(p.getDate().getYear()==currentSqlDate.getYear()) {
				prix = p;
			}
		}
		float nvprix = (float) (prix.getPrixScolarité()+prix.getPrixScolarité()*0.05);
		
		prix.setPrixScolarité(nvprix);
		
		prixRepository.save(prix);

	}
	

	
	
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
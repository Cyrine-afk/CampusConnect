package tn.esprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Fournisseur;
import tn.esprit.repositories.FournisseurRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class FournisseurServiceImpl implements IFournisseurService {
    FournisseurRepository fournisseurRepo;

    /*@Override
    public List<Fournisseur> ListFournisseurs(){
        return fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur ajouterFournisseur(Fournisseur fourn) {
        return fournisseurRepo.save(fourn);
    }*/

    /*public Reclamation ajouterReclamation(Reclamation r) {
        return reclamationRepository.save(r);

    }

    public List<Reclamation> ListReclamations(){
        return reclamationRepository.findAll();
    }


    public void supprimerReclamation(Long idReclamation) {
        Reclamation r = reclamationRepository.findById(idReclamation).orElse(null);

        reclamationRepository.delete(r);
    }

    public void updateReclamation(Reclamation reclamation, Long idReclamation) {

        Reclamation rec= reclamationRepository.findById(idReclamation).orElse(null);

        rec.setIdRec(idReclamation);
        rec.setContenuRec(reclamation.getContenuRec());
        rec.setType(reclamation.getType());
        rec.setSendingDate(reclamation.getSendingDate());
        reclamationRepository.save(rec);

    }


    public Reclamation getReclamationById(Long idReclamation) {
        return reclamationRepository.getById(idReclamation);
    }*/
}

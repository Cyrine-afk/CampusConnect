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

    @Override
    public List<Fournisseur> ListFournisseurs(){
        return fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur ajouterFournisseur(Fournisseur fourn) {
        return fournisseurRepo.save(fourn);
    }

    @Override
    public void supprimerFournisseur(Integer idFourn) {
        Fournisseur r = fournisseurRepo.findById(idFourn).orElse(null);

        fournisseurRepo.delete(r);
    }

    @Override
    public void updateFournisseur(Fournisseur fournisseur, Integer idFourn) {

        Fournisseur rec= fournisseurRepo.findById(idFourn).orElse(null);

        rec.setIdFourn(idFourn);
        rec.setSpecialty(fournisseur.getSpecialty());
        rec.setAdrFourn(fournisseur.getAdrFourn());
        rec.setNomFourn(fournisseur.getNomFourn());
        rec.setTelFourn(fournisseur.getTelFourn());
        rec.setMatriculeFourn(fournisseur.getMatriculeFourn());
        fournisseurRepo.save(rec);

    }

    @Override
    public Fournisseur getFournisseurById(Integer idFourn) {
        return fournisseurRepo.getById(idFourn);
    }
}

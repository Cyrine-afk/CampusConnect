package tn.esprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.entities.NGO;
import tn.esprit.repositories.NGORepositoy;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class NGOServiceImpl implements INGOService {
    NGORepositoy ngoRepo;

    @Override
    public NGO ajouterNgo(NGO ng) {
        return ngoRepo.save(ng);

    }

    @Override
    public List<NGO> ListNGOs(){
        return ngoRepo.findAll();
    }

    @Override
    public void supprimerNGO(Integer idNgo) {
        NGO r = ngoRepo.findById(idNgo).orElse(null);

        ngoRepo.delete(r);
    }

    @Override
    public void updateNGO(NGO ng, Integer idNgo) {

        NGO rec= ngoRepo.findById(idNgo).orElse(null);

        rec.setIdNGO(idNgo);
        rec.setNomNGO(ng.getNomNGO());
        rec.setType(ng.getType());
        rec.setDescrNGO(ng.getDescrNGO());
        rec.setNumTelNGO(ng.getNumTelNGO());
        rec.setLogoNGO(ng.getLogoNGO());
        rec.setDescrNGO(ng.getDescrNGO());
        ngoRepo.save(rec);

    }

    @Override
    public NGO getNGOById(Integer idNgo) {
        return ngoRepo.getById(idNgo);
    }
}

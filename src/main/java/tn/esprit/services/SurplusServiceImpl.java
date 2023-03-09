package tn.esprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.Interfaces.ISurplusService;
import tn.esprit.entities.Stock;
import tn.esprit.entities.SurplusAlim;
import tn.esprit.repositories.SurplusRepository;
import tn.esprit.repositories.TransactionSurplusNGORepository;

import java.util.Date;
import java.util.List;

import static java.lang.Boolean.compare;

@Service
@AllArgsConstructor
@Slf4j
public class SurplusServiceImpl implements ISurplusService {
    SurplusRepository surplusRepo;
    TransactionSurplusNGORepository transRepo;

    @Override
    public SurplusAlim ajouterSurplus(SurplusAlim st) {

        Date date = new Date(System.currentTimeMillis());
        st.setDateAjoutSurplus(date);
        st.setDonatedOrNot(0);
        return surplusRepo.save(st);
    }

    @Override
    public List<SurplusAlim> ListSurplus(){
        return surplusRepo.findAll();
    }

    @Override
    public void supprimerSurplus(Integer idSurplus) {
        SurplusAlim r = surplusRepo.findById(idSurplus).orElse(null);

        surplusRepo.delete(r);
    }

    @Override
    public void updateSurplus(SurplusAlim ng, Integer idSurplus) {

        SurplusAlim rec= surplusRepo.findById(idSurplus).orElse(null);

        rec.setIdSurplus(ng.getIdSurplus());
        rec.setDateAjoutSurplus(ng.getDateAjoutSurplus());
        rec.setQttIngrSurplus(ng.getQttIngrSurplus());
        surplusRepo.save(rec);

    }

    @Override
    public SurplusAlim getSurplusById(Integer idSurplus) {

        return surplusRepo.getById(idSurplus);
    }

    //HERE
    @Scheduled(fixedRate = 5000)
    public void controleQttSurplus() {

        List<SurplusAlim> surp = surplusRepo.findAll();
        for (SurplusAlim s : surp) {
            if (s.getDonatedOrNot()==1) {
                float qtt = transRepo.qttDon(s.getIdSurplus());
                s.setQttIngrSurplus(s.getQttIngrSurplus()  -  qtt);
                System.out.println("Donated stock quantity decremented "+s.getQttIngrSurplus());
            }
        }


    }
}

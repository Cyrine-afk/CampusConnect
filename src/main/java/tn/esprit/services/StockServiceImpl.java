package tn.esprit.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Stock;
import tn.esprit.repositories.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class StockServiceImpl implements IStockService {
    StockRepository stockRepo;

    @Override
    public Stock ajouterStock(Stock st) {
        return stockRepo.save(st);
    }

    @Override
    public List<Stock> ListStocks(){
        return stockRepo.findAll();
    }

    @Override
    public void supprimerStock(Integer idStock) {
        Stock r = stockRepo.findById(idStock).orElse(null);

        stockRepo.delete(r);
    }

    @Override
    public void updateStock(Stock ng, Integer idStock) {

        Stock rec= stockRepo.findById(idStock).orElse(null);

        rec.setIdIngr(ng.getIdIngr());
        //rec.setFournisseur(ng.getFournisseur());
        rec.setCodeIngr(ng.getCodeIngr());
        rec.setDateAjout(ng.getDateAjout());
        rec.setDateExpiration(ng.getDateExpiration());
        rec.setNomIngr(ng.getNomIngr());
        rec.setPrixUnitaireIngr(ng.getPrixUnitaireIngr());
        rec.setQttIngr(ng.getQttIngr());
        rec.setUniteIngr(ng.getUniteIngr());
        stockRepo.save(rec);

    }

    @Override
    public Stock getStockById(Integer idStock) {
        return stockRepo.getById(idStock);
    }
}

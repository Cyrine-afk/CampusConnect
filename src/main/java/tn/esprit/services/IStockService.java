package tn.esprit.services;

import tn.esprit.entities.Stock;

import java.util.List;

public interface IStockService {
    Stock ajouterStock(Stock st);

    List<Stock> ListStocks();

    void supprimerStock(Integer idStock);

    void updateStock(Stock ng, Integer idStock);

    Stock getStockById(Integer idStock);

    //Stock ajouterStock(Stock stock);
}

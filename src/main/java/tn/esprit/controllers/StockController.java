package tn.esprit.controllers;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.entities.NGO;
import tn.esprit.entities.Stock;
import tn.esprit.services.NGOServiceImpl;
import tn.esprit.services.StockServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class StockController {
    @Autowired
    StockServiceImpl stockService;


    @PostMapping("/addStock")
    @ResponseBody
    public Stock addStock(@RequestBody Stock r)
    {
        return  stockService.ajouterStock(r);

    }

    @GetMapping("/listStock")
    @ResponseBody
    public List<Stock> listStocks(){

        return stockService.ListStocks();
    }

    @DeleteMapping("/deleteStock/{idStock}")
    @ResponseBody
    public void deleteNGO(@PathVariable("idStock") Integer idStock){

        stockService.supprimerStock(idStock);
    }

    @PutMapping("/modifierStock/{idStock}")
    @ResponseBody
    public void modifierStock(@RequestBody Stock r,@PathVariable("idStock") Integer idStock){
        stockService.updateStock(r,idStock);
    }

    @GetMapping("/getStock/{idStock}")
    @ResponseBody
    public Stock getStockByiD(@PathVariable("idStock") Integer idStock){

        return stockService.getStockById(idStock);
    }
}
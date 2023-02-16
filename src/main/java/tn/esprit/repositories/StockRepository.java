package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.entities.NGO;

public interface StockRepository extends JpaRepository<NGO, Integer> {

}

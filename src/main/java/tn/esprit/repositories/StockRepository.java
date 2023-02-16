package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.NGO;
import tn.esprit.entities.Stock;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

}

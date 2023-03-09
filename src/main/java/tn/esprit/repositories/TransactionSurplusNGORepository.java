package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Stock;
import tn.esprit.entities.Transaction_Surplus_NGO;
import tn.esprit.entities.TypeNGO;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionSurplusNGORepository extends JpaRepository<Transaction_Surplus_NGO, Integer> {
    //HERE
    @Query("select n.qttDonated from Transaction_Surplus_NGO n where n.surplusAlim.idSurplus=:id")
    float qttDon(int id);
}

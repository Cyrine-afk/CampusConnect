package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Stock;
import tn.esprit.entities.SurplusAlim;

import java.util.Date;
import java.util.List;

@Repository
public interface SurplusRepository extends JpaRepository<SurplusAlim, Integer> {
    //List<SurplusAlim> getSurplusAlimByDonatedOrNotEquals(boolean bool);
    @Query("SELECT COUNT(n) FROM SurplusAlim n")
    int  countallsurplus();
    /*@Query("SELECT n from SurplusAlim n where n.donatedOrNot=:bool")
    SurplusAlim gottenSurplus(boolean bool);*/

}

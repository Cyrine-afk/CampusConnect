package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.NGO;

@Repository
public interface NGORepositoy extends JpaRepository<NGO, Integer> {
}

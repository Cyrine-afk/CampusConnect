package tn.reclamation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
>>>>>>> Stashed changes
=======
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
>>>>>>> Stashed changes
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
=======

>>>>>>> Stashed changes
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUser")  
	private Long idUser; 
	
	private String nomUser;
	private String prenomUser;
	private String emailUser;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateNaissance;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	
	
	private String numTel ;
	private String adresse;
	
=======
=======
>>>>>>> Stashed changes


	private String numTel ;
	private String adresse;
	
	private Boolean abonneRestaurant;
	private Boolean abonneFoyer;
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	@JsonIgnore
	private List<Reclamation> reclamations;
}

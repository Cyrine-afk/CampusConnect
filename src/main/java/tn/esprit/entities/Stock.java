package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIngr;
	private String codeIngr;
	@Temporal(TemporalType.DATE)
	private Date dateAjout;
	@Temporal(TemporalType.DATE)
	private Date dateExpiration;
	@Temporal(TemporalType.DATE)
	private Date dateDonation;
	private String nomIngr;
	private float prixUnitaireIngr;
	private float qttIngr;
	private float qttSurplus;
	private String uniteIngr;

	@ManyToOne
	@JsonIgnore
	private Fournisseur fournisseur;
}

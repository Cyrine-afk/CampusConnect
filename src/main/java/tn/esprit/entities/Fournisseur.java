package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFourn;
	private String adrFourn;
	private String matriculeFourn;
	private String nomFourn;
	private String telFourn;
	@Enumerated(EnumType.STRING)
	private SpecialtyFourn specialty;

	@ManyToOne
	@JsonIgnore
	private Stock stocks;

}

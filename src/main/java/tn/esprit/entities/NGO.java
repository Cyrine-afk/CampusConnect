package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NGO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNGO;
	private String nomNGO;
	private String adrNGO;
	private String numTelNGO;
	private String descrNGO;
	private String logoNGO;
	@Enumerated(EnumType.STRING)
	private TypeNGO type;

	@ManyToMany
	@JsonIgnore
	Set<Stock> surplus;

}

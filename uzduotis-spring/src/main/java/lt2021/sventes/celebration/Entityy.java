package lt2021.sventes.celebration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entityy {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

}

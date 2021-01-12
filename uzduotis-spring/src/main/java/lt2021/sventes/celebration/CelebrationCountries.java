package lt2021.sventes.celebration;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lt2021.sventes.country.Country;

@Entity
@Table(name = "celebration_counties")
public class CelebrationCountries {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH })
	@JoinColumn(name = "celebration_id")
	private Celebration celebration;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH })
	@JoinColumn(name = "country_id")
	private Country country;

	public CelebrationCountries() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Celebration getCelebration() {
		return celebration;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCelebration(Celebration celebration) {
		this.celebration = celebration;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}

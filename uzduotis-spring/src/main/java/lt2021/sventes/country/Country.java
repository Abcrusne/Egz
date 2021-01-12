package lt2021.sventes.country;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lt2021.sventes.celebration.CelebrationCountries;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(unique = true)
	private String title;

	private String image;
	private String president;

//	private String years;
	// private Years years;

	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private Set<CelebrationCountries> countries;

	public Country() {
		super();
	}

	public Country(String title, String image, String president) {
		super();
		this.title = title;
		this.image = image;
		this.president = president;

		this.countries = new HashSet<>();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public String getPresident() {
		return president;
	}

	public Set<CelebrationCountries> getCountries() {
		return countries;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public void setCountries(Set<CelebrationCountries> countries) {
		this.countries = countries;
	}

}

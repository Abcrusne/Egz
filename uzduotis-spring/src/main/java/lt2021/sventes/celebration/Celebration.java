package lt2021.sventes.celebration;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Celebration {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(unique = true)
	private String title;

	private String desc;
	private String image;

	@Enumerated(EnumType.STRING)
	private CelebrationType type;

	private String flag;

	@OneToMany(mappedBy = "celebration", cascade = CascadeType.ALL)
	private Set<CelebrationCountries> countries;

	public Celebration() {
		super();
	}

	public Celebration(String title, String desc, String image, CelebrationType type, String flag) {
		super();
		this.title = title;
		this.desc = desc;
		this.image = image;
		this.type = type;
		this.flag = flag;
		this.countries = new HashSet<>();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}

	public String getImage() {
		return image;
	}

	public CelebrationType getType() {
		return type;
	}

	public String getFlag() {
		return flag;
	}

	public Set<CelebrationCountries> getCountries() {
		return countries;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setType(CelebrationType type) {
		this.type = type;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public void setCountries(Set<CelebrationCountries> countries) {
		this.countries = countries;
	}

}

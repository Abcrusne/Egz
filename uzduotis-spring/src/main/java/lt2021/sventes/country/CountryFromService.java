package lt2021.sventes.country;

public class CountryFromService {

	private long id;
	private String title;
	private String image;
	private String president;

	public CountryFromService() {
		super();
	}

	public CountryFromService(String title, String image, String president) {
		super();
		this.title = title;
		this.image = image;
		this.president = president;
	}

	public CountryFromService(long id, String title, String image, String president) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.president = president;
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

}

package lt2021.sventes.country;

public class CreateCountryCommand {

	private String title;
	private String image;
	private String president;

	public CreateCountryCommand() {
		super();
	}

	public CreateCountryCommand(String title, String image, String president) {
		super();
		this.title = title;
		this.image = image;
		this.president = president;
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

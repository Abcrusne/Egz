package lt2021.sventes.celebration;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class CreateCelebrationCommand {

	// nera id

	private String title;
	private String desc;
	private String image;

	@Enumerated(EnumType.STRING)
	private CelebrationType type;

	private String flag;

	public CreateCelebrationCommand() {
		super();
	}

	public CreateCelebrationCommand(String title, String desc, String image, CelebrationType type, String flag) {
		super();
		this.title = title;
		this.desc = desc;
		this.image = image;
		this.type = type;
		this.flag = flag;
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

}

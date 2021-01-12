package lt2021.sventes.celebration;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class CelebrationFromService {

	private Long id;

	private String title;

	private String desc;
	private String image;

	@Enumerated(EnumType.STRING)
	private CelebrationType type;

	private String flag;

	public CelebrationFromService() {
		super();
	}

	public CelebrationFromService(Long id, String title, String desc, String image, CelebrationType type, String flag) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.image = image;
		this.type = type;
		this.flag = flag;
	}

	public CelebrationFromService(String title, String desc, String image, CelebrationType type, String flag) {
		super();
		this.title = title;
		this.desc = desc;
		this.image = image;
		this.type = type;
		this.flag = flag;
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

}

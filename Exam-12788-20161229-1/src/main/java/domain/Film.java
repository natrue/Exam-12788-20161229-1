package domain;

public class Film {
	private String title;//电影名称
	private String description;//电影描述
	private int id;//语言Id
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Film(String title, String description, int id) {
		super();
		this.title = title;
		this.description = description;
		this.id = id;
	}
	public Film() {
		super();
	}

	
}

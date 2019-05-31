
public class BaseCharacter {
	protected String name, description;

	public BaseCharacter(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void getInfo() {
		System.out.println(name + " " + description);
	}
}

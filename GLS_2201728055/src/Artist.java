import Interface.IArtist;

public class Artist extends BaseCharacter implements IArtist {

	public Artist(String name, String description) {
		super(name, description);
	}

	@Override
	public void Draw() {
		System.out.println(name + " melukis.");
		
	}

}

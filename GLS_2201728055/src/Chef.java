import Interface.IArtist;
import Interface.IChef;

public class Chef extends BaseCharacter implements IChef, IArtist {


	public Chef(String name, String description) {
		super(name, description);
	}

	@Override
	public void Cook() {
		System.out.println(name + " memasak.");
	}

	@Override
	public void Draw() {
		System.out.println(name + " melukis.");
		
	}

}

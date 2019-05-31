import Interface.IDriver;

public class Driver extends BaseCharacter implements IDriver{


	public Driver(String name, String description) {
		super(name, description);
	}

	@Override
	public void Drive() {
		System.out.println(name + " menyetir.");
		
	}

}

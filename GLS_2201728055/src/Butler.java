import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class Butler extends BaseCharacter implements IArtist, IChef, IDriver, IWorker {


	public Butler(String name, String description) {
		super(name, description);
	}

	@Override
	public void Drive() {
		System.out.println(name + " menyetir.");
		
	}

	@Override
	public void Draw() {
		System.out.println(name + " melukis.");
		
	}

	@Override
	public void Work() {
		System.out.println(name + " bekerja.");
		
	}

	@Override
	public void Cook() {
		System.out.println(name + " memasak.");
		
	}

}

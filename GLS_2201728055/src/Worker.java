import Interface.IDriver;
import Interface.IWorker;

public class Worker extends BaseCharacter implements IWorker, IDriver {



	public Worker(String name, String description) {
		super(name, description);
	}

	@Override
	public void Drive() {
		System.out.println(name + " menyetir.");
		
	}

	@Override
	public void Work() {
		System.out.println(name + " bekerja.");
		
	}

}

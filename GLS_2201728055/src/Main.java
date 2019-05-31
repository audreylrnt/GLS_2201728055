import java.util.*;
import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<BaseCharacter> characters = new Vector<BaseCharacter>();
	String command;
	
	public Main() {
		characters.add(new Artist("Artist", "seorang yang dapat melukis."));
		characters.add(new Butler ("Butler", "seorang yang dapat bekerja, melukis, memasak, dan menyetir."));
		characters.add(new Chef ("Chef", "seorang yang dapat melukis dan memasak."));
		characters.add(new Driver ("Driver", "seorang yang dapat menyetir."));
		characters.add(new Student ("Student", "seorang yang tidak dapat melakukan apa-apa."));
		characters.add(new Worker ("Worker", "seorang yang dapat bekerja dan menyetir."));
		
		show();
		do {
			do {
				System.out.println("INPUT [Info | Cook | Draw | Drive | Work] [Character ID 0..5]: ");
				command = scan.nextLine();
			} while (!command.contains("Info") && !command.contains("Cook") && !command.contains("Draw")
					&& !command.contains("Drive") && !command.contains("Work"));
			String action = command.substring(0, command.indexOf(" "));
			String charIdx = command.substring(command.indexOf(" ") + 1);
			for (int i = 0; i < charIdx.length(); i += 2) {
				Integer index = Integer.parseInt(charIdx.substring(i, i + 1));
				switch(action) {
				case "Info":
					characters.get(index).getInfo();
					scan.nextLine();
					break;
				case "Cook":
					if(characters.get(index) instanceof IChef) {
						((IChef) characters.get(index)).Cook();
						scan.nextLine();
					} else {
						System.out.println(characters.get(index).getName() + " tidak dapat melakukan aksi.");
						scan.nextLine();
					}
					break;
				case "Draw":
					if(characters.get(index) instanceof IArtist) {
						((IArtist) characters.get(index)).Draw();
						scan.nextLine();
					} else {
						System.out.println(characters.get(index).getName() + " tidak dapat melakukan aksi.");
						scan.nextLine();
					}
					break;
				case "Drive":
					if(characters.get(index) instanceof IDriver) {
						((IDriver) characters.get(index)).Drive();
						scan.nextLine();
					} else {
						System.out.println(characters.get(index).getName() + " tidak dapat melakukan aksi.");
						scan.nextLine();
					}
					break;
				case "Work":
					if(characters.get(index) instanceof IWorker) {
						((IWorker) characters.get(index)).Work();
						scan.nextLine();
					} else {
						System.out.println(characters.get(index).getName() + " tidak dapat melakukan aksi.");
						scan.nextLine();
					}
					break;
				}
			}
		} while (!command.equals("Exit"));
		System.out.println("Thank you.");
	}
	
	public void show() {
		System.out.println("Simulasi kelompok kemampuan");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(i + ": " + characters.get(i).getName());
        }
        System.out.println("6: Exit");
	}
	
	public static void main(String[] args) {
		new Main();
	}

}

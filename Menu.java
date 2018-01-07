import java.util.Scanner;

public class Menu {

	public static Scanner s = new Scanner(System.in);
	public static int choice;

	Menu() {
		String f, l, p;
		int i, a, b, c,d,e;

		System.out.println("	****** Select from menu below : ******\n");
		System.out
				.println("(1): Add Patient\n(2): Delete Patient\n(3): View Positions\n"
						+ "(4): Change Position\n(5): Update Record\n"
						+ "(6): Delete from last\n(7): Exit");
		choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter first name :");
			f = s.next();
			System.out.println("Enter last name :");
			l = s.next();
			System.out.println("Enter patient ID :");
			i = s.nextInt();
			System.out.println("Enter patient contact# :");
			p = s.next();
			LinkedList.append(f, l, i, p);
			Done();
		case 2:
			System.out.println("Enter Patient ID :");
			a = s.nextInt();
			LinkedList.deleteNode(a);
			Done();
		case 3:
			LinkedList.showlist();
			Done();
		case 4:
			System.out.println("Enter Patient ID :");
			b = s.nextInt();
			System.out.println("Enter new position :");
			c = s.nextInt();
			LinkedList.shuffle(b, c);
			Done();
		case 5:
			System.out.println("Enetr patient ID : ");
			d=s.nextInt();
			LinkedList.update(d);
			Done();
		case 6:
			System.out.println("Enter # of Patients you want to remove :");
			e=s.nextInt();
			LinkedList.lastdel(e);
			Done();
			
		case 7:
			System.out.println("Terminated......");
			System.exit(0);
		}
	}

	public void Done() {
		int ch;
		System.out.println("Done!\n(1): Exit\t(2): Menu");
		ch = s.nextInt();
		if (ch == 1) {
			System.out.println("Terminated......");
			System.exit(0);
		} else
			new Menu();
	}

	public static void main(String args[]) {

		new Menu();

	}

}

package zadacha5;

public class Main {

	public static void main(String[] args) {

		Predmet obj1 = new Predmet ();				
				Predmet obj2 = new Predmet ("Matematika 1");
				Predmet obj3 = new Predmet ("OOP", "Ilija Joleski", 6);
				
				obj1.ime = "Napredno Programiranje";
				obj1.profesor = "Ramona Markoska";
				obj1.krediti = 6;
				obj1.semestar = "II-ri";
				
				System.out.println(obj1.ime + " " + obj1.profesor + " " + obj1.krediti + " " + obj1.semestar);
				System.out.println(obj2.ime);
				System.out.println(obj3.ime + " " + obj3.profesor + " " + obj3.krediti);
	}

}

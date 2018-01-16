import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Martin", "Rosok", 36);
		Person person2 = new Person("Bjarne", "Betjent", 47);

		System.out.println(person1.getFornavn() + " " + person1.getEtternavn() + ", " + person1.getAlder());
		System.out.println(person2.getFornavn() + " " + person2.getEtternavn() + ", " + person2.getAlder());
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Skriv inn fornavn paa tredje person: ");
		String fornavn = scanner.nextLine();

		System.out.println("Skriv inn etternavn paa tredje person: ");
		String etternavn = scanner.nextLine();

		System.out.println("Skriv inn alder paa tredje person: ");
		int alder = scanner.nextInt();


		Person person3 = new Person(fornavn, etternavn, alder);

		System.out.println(person3.getFornavn() + " " + person3.getEtternavn() + ", " + person3.getAlder());
	
		}

}
	
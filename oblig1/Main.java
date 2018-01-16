import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//oppretter og initialiserer to personer fra konstruktøren
		Person person1 = new Person("Martin", "Rosok", 36);
		Person person2 = new Person("Bjarne", "Betjent", 47);

		//printer ut navn og alder på person1 og person2
		System.out.println(person1.getFornavn() + " " + person1.getEtternavn() + ", " + person1.getAlder());
		System.out.println(person2.getFornavn() + " " + person2.getEtternavn() + ", " + person2.getAlder());
		
		//oppretter og initialiser et scanner-objekt
		Scanner scanner = new Scanner(System.in);

		//får data for tredje person fra brukerinput
		System.out.println("Skriv inn fornavn paa tredje person: ");
		String fornavn = scanner.nextLine();

		System.out.println("Skriv inn etternavn paa tredje person: ");
		String etternavn = scanner.nextLine();

		System.out.println("Skriv inn alder paa tredje person: ");
		int alder = scanner.nextInt();

		//oppretter person3 fra brukerdata
		Person person3 = new Person(fornavn, etternavn, alder);
		//printer ut navn og alder på person3
		System.out.println(person3.getFornavn() + " " + person3.getEtternavn() + ", " + person3.getAlder());

		//test av set-metoder

		person1.setAlder(23);
		person2.setFornavn("Monika");
		person3.setEtternavn("McBoatFace");

		//utskrift av ny data
		System.out.println("Data er endret av systemet: ");
		System.out.println(person1.getFornavn() + " " + person1.getEtternavn() + ", " + person1.getAlder());
		System.out.println(person2.getFornavn() + " " + person2.getEtternavn() + ", " + person2.getAlder());
		System.out.println(person3.getFornavn() + " " + person3.getEtternavn() + ", " + person3.getAlder());
	
		}

}
	
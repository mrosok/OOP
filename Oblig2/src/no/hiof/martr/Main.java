package no.hiof.martr;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //oppgave 2 - opprett serie og episoder (med og uten runtime)
	    TVSeries GameOfThrones = new TVSeries("Game of Thrones", "pupper og sverd", 2011);
	    Episode episode1 = new Episode(1,1,"Winter is coming", LocalDate.of(2011,4,17), 62);
	    Episode episode2 = new Episode(2,1,"The Kingsroad",LocalDate.of(2011,4,24));

	    //oppgave 2 - legg til episoder i en serie
	    GameOfThrones.addEpisode(episode1);
        GameOfThrones.addEpisode(episode2);

        //oppgave 3 - test override-metoder
        System.out.println(GameOfThrones.toString());
        System.out.println(episode2.toString());

        //oppgave 4 - lag 5 sesonger med 20 episoder og list episoder i sesong 4
        GameOfThrones.createEpisodes(5,20);
        GameOfThrones.listEpisodes(4);

        //oppgave 6 - print ut gjennomsnittlig spilletid
        System.out.println("Average runtime: " + GameOfThrones.getAvgRuntime() + " minutes");

        //oppgave 8 - test implementasjon av oppgave 7 (validering)
        System.out.println("Number of seasons in " + GameOfThrones.getTitle() + ": " + GameOfThrones.getNumberOfSeasons());

            //legger til episode i gyldig sesong 6 - får korrekt output fra System.out
            Episode episode3 = new Episode(1,6,"Larseknu in trouble",LocalDate.of(2018,1,21));
            GameOfThrones.addEpisode(episode3);
            System.out.println("Number of seasons in " + GameOfThrones.getTitle() + ": " + GameOfThrones.getNumberOfSeasons());

            //legger til episode med ugyldig sesong 8 - får feilmelding fra System.out
            Episode episode4 = new Episode(1,8,"Larseknu saves the day",LocalDate.of(2018,1,22));
            GameOfThrones.addEpisode(episode4);
            System.out.println("Number of seasons in " + GameOfThrones.getTitle() + ": " + GameOfThrones.getNumberOfSeasons());

    }
}

/* OPPGAVE 9

    CLASS = en "blueprint" for et objekt. Inneholder variabler og metoder som beskriver tilstanden og egenskapene til et objekt.
    OBJECT = en instanse av en klasse (Class), som får alle egenskapene beskrevet i klassen.
    MEMBER/FIELD VARIABLE = variabler i en klasse som beskriver tilstanden til et objekt.
    OVERLOADING = Flere konstruktører og metoder kan ha samme navn hvis parameter-listene deres er forskjellige.
    OVERRIDING = En arvet metode som er overskrevet/modifisert.
    EXTENDS = Å arve fra en annen klasse. Gjeldene klasse får da tilgang på funksjonaliteten fra klassen det "extendes" fra.
    POLYMORPHISM =
    PRIVATE/PUBLIC etc = Private vil si at metoden/feltvariabelen bare er tilgjengelig i sin egen klasse. Public derimot er tilgjengelig for alle utenfor egen klasse.
                         Protected kan nås av alle i sin egen pakke, og i tillegg av sub-klasser av sin klasse i andre pakker.
    THIS/SUPER = this referer til "denne" instansen av en klasse - objektet hvor i metoden/konstruktøren blir kalt.
                 super referer til "superklassen" eller "foreldreklassen" til en klasse, altså klassen det er direkte arvet fra. Vi kan da referere til en feltvariabel,                metode eller konstruktør

*/
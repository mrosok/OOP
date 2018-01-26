package no.hiof.martr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

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
        createEpisodes(GameOfThrones, 5,20);
        GameOfThrones.listEpisodes(4);

        //oppgave 6 - print ut gjennomsnittlig spilletid
        System.out.println("Average runtime: " + GameOfThrones.getAvgRuntime() + " minutes");

        // alternativt setRuntime i stedet for å oppdatere oppgave 4
        // ArrayList<Episode> episodes = GameOfThrones.getEpisodes();
        // for(int i=0; i<episodes.size(); i++) {
        //     episodes.get(i).setRuntime(randomRuntime());
        // }

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
    //metode til oppgave 4 (oppdatert i oppgave 6 for å legge random runtime)
    public static void createEpisodes(TVSeries tvseries, int seasons, int episodesPerSeason) {
        for (int i = 1; i <= seasons; i++) {
            for (int j = 1; j <= episodesPerSeason; j++) {
                Episode episode = new Episode(j, i, "Episode " + j, LocalDate.of(2000, 1, j + 1),randomRuntime());
                tvseries.addEpisode(episode);
            }
        }
    }
    //metode til oppgave 6, gir tilfeldig int mellom 20 og 30
    public static int randomRuntime() {
        Random rand = new Random();
        int n = rand.nextInt(30) + 20;
        return n;
    }
}

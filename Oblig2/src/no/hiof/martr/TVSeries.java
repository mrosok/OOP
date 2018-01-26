package no.hiof.martr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

//oppgave 1 - lag klasse
public class TVSeries {
    private String title;
    private String description;
    // synes det er mer fornuftig å ha bare år som utgivelsesinfo for TV-serie, og heller dato på enkeltepisoder
    private int releaseYear;
    private ArrayList<Episode> episodes = new ArrayList<>();
    private int avgRuntime;
    private int numberOfSeasons;

    public TVSeries(String title, String description, int releaseYear) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.numberOfSeasons = 1;
    }

    public void addEpisode(Episode episode) {

        //oppdatert validering for oppgave 7
        if (episode.getSeason() > this.numberOfSeasons + 1) {
            System.out.println("Season number exceeds limit");
        } else if (episode.getSeason() == this.numberOfSeasons + 1) {
            this.numberOfSeasons++;
            this.episodes.add(episode);
        } else {
            this.episodes.add(episode);
        }
        //oppgave 5 - inkludert updateAvgRuntime
        updateAvgRuntime();
    }

    //oppgave 3 - override toString()
    @Override
    public String toString() {
        return this.title + "(" + this.releaseYear + ") / " + this.numberOfSeasons + (this.numberOfSeasons > 1 ? " seasons" : " season");
    }

    //oppgave 4 - liste av alle episoder
    public void listEpisodes(int season) {
        for (int i = 0; i < episodes.size(); i++) {
            if (episodes.get(i).getSeason() == season) {
                System.out.println(episodes.get(i).toString());
            }
        }
    }
    //metode til oppgave 4 (oppdatert i oppgave 6 for å legge random runtime)
    public void createEpisodes(int seasons, int episodesPerSeason) {
        for (int i = 1; i <= seasons; i++) {
            for (int j = 1; j <= episodesPerSeason; j++) {
                Episode episode = new Episode(j, i, "Episode " + j, LocalDate.of(2000, 1, j + 1), randomRuntime());
                this.addEpisode(episode);
            }
        }
    }

    //oppgave 5 - kalkuler gjennomsnittlig spilletid
    public void updateAvgRuntime() {
        int sum = 0;
        for (int i = 0; i < episodes.size(); i++) {
            sum += episodes.get(i).getRuntime();
        }
        this.avgRuntime = sum / episodes.size();
    }

    //oppgave 6 - gir tilfeldig int mellom 20 og 30
    public static int randomRuntime() {
        Random rand = new Random();
        int n = rand.nextInt(30) + 20;
        return n;
    }

/*  (oppgave 6) alternativ setRuntime i stedet for å oppdatere oppgave 4

    ArrayList<Episode> episodes = GameOfThrones.getEpisodes();
    for(int i=0; i<episodes.size(); i++) {
        episodes.get(i).setRuntime(randomRuntime());
    }
*/


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfSeasons() {
        return this.numberOfSeasons;
    }

    public ArrayList<Episode> getEpisodes() {
        return this.episodes;
    }

    public int getAvgRuntime() {
        return avgRuntime;
    }

}








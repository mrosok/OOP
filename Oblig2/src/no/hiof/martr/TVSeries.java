package no.hiof.martr;

import no.hiof.martr.Episode;

import java.util.ArrayList;

//oppgave 1 - lag klasse
public class TVSeries {
    private String title;
    private String description;
    //synes det er mer fornuftig å ha bare år som utgivelsesinfo for TV-serie, og heller dato på enkeltepisoder
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

    public void addEpisode(Episode episode) {

        //oppdatert validering for oppgave 7
        if(episode.getSeason() > this.numberOfSeasons + 1) {
            System.out.println("Season number exceeds limit");
        } else if (episode.getSeason() == this.numberOfSeasons + 1){
            this.numberOfSeasons++;
            this.episodes.add(episode);
        } else {
            this.episodes.add(episode);
        }
        //oppgave 5 - inkludert updateAvgRuntime
        updateAvgRuntime();
    }

    //oppgave 3 - override toString()
    //la også til antall sesonger fra oppgave 7
    @Override
    public String toString() {
        return this.title + "(" + this.releaseYear + ") / " + this.numberOfSeasons + (this.numberOfSeasons>1? " seasons":" season") ;
    }

    //oppgave 4 - liste av alle episoder
    public void listEpisodes(int season) {
        for (int i = 0; i < episodes.size(); i++) {
            if (episodes.get(i).getSeason() == season) {
                System.out.println(episodes.get(i).toString());
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
}







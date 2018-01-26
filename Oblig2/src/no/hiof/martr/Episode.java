package no.hiof.martr;

import java.time.LocalDate;
// oppgave 1 - lag klasse
public class Episode {
    private int episodeNumber;
    private int season;
    private String title;
    private LocalDate releaseDate;
    private int runtime;  //lengde i minutter

    public Episode(int episodeNumber, int season, String title, LocalDate releaseDate, int runtime) {
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.title = title;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
    }

    public Episode(int episodeNumber, int season, String title, LocalDate releaseDate) {
        this(episodeNumber, season, title, releaseDate, 0);
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    //oppgave 3 - override toString()
    @Override
    public String toString() {
        return "S" + this.season + "E" + this.episodeNumber + ": " + this.title + "(" + this.runtime + " minutes)";
    }
}

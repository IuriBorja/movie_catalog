package movie_catalog.models;

import movie_catalog.calculations.Classification;

public class Movie extends Title implements Classification {

    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (getAverage() / 2);
    }

    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ") ";
    }

}

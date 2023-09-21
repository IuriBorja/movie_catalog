package movie_catalog.models;

import com.google.gson.annotations.SerializedName;
import movie_catalog.exception.YearConversionErrorException;

public class Title implements Comparable<Title>{


    private String name;
    private int releaseYear;
    private boolean isIncludedOnPlan;
    private double sumOfAvaliation;
    private int totalAvaliation;
    private int lastsInMin;


    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

            if (myTitleOmdb.year().length() > 4) {
                throw new YearConversionErrorException("I could not convert the year because it has more than 04 characters");
            }

        this.releaseYear = Integer.parseInt(myTitleOmdb.year());
        this.lastsInMin = Integer.parseInt(myTitleOmdb.runtime().substring(0, 2));
    }

    /* exibe ficha tecnica */
    public void showDatasheet() {
        System.out.println("Name of the movie: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Last in minutes: " + lastsInMin);
        System.out.println("Included on the plan: " + isIncludedOnPlan);
    }


    /* avalia */
    public void review(double score) {
        sumOfAvaliation += score;
        totalAvaliation++;
    }

    /* pega media */
    public double getAverage() {
        return sumOfAvaliation / totalAvaliation;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedOnPlan(boolean includedOnPlan) {
        isIncludedOnPlan = includedOnPlan;
    }

    public void setLastsInMin(int lastsInMin) {
        this.lastsInMin = lastsInMin;
    }


    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedOnPlan() {
        return isIncludedOnPlan;
    }

    public int getTotalAvaliation() {
        return totalAvaliation;
    }

    public int getLastsInMin() {
        return lastsInMin;
    }


    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }


    @Override
    public String toString() {
        return "Title{" +
                "name = " + name +
                ", releaseYear = " + releaseYear +
                ", lastsInMin = " + lastsInMin + " min" +
                '}';
    }
}

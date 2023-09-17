package movie_catalog.models;

public class Movie {

    private String name;
    private int releaseYear;
    private boolean isIncludedOnPlan;
    private double sumOfAvaliation;
    private int totalAvaliation;
    private int lastsInMin;


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
}

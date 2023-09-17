package movie_catalog.models;

public class Movie {

    private String name;
    int releaseYear;
    boolean isIncludedOnPlan;
    double sumOfAvaliation;
    int totalAvaliation;
    int lastsInMin;



    public void showDatasheet() {
        System.out.println("Name of the movie: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Last in minutes: " + lastsInMin);
        System.out.println("Included on the plan: " + isIncludedOnPlan);
    }


    public void review(double score) {
        sumOfAvaliation += score;
        totalAvaliation++;
    }

    public double getAverage() {
        return sumOfAvaliation / totalAvaliation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

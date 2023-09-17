

public class Movie {

    String name;
    int releaseYear;
    boolean isIncludedOnPlan;
    double sumOfAvaliation;
    int totalAvaliation;
    int lastsInMin;



    void showDatasheet() {
        System.out.println("Name of the movie: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Last in minutes: " + lastsInMin);
        System.out.println("Included on the plan: " + isIncludedOnPlan);
    }


    void review(double score) {
        sumOfAvaliation += score;
        totalAvaliation++;
    }

    double getAverage() {
        return sumOfAvaliation / totalAvaliation;
    }


}

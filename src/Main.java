import movie_catalog.calculations.TimeCalculator;
import movie_catalog.models.Movie;
import movie_catalog.models.Series;

public class Main {
    public static void main(String[] args) {

        Movie favorite = new Movie();
        favorite.setName("Interstellar");
        favorite.setReleaseYear(2014);
        favorite.setLastsInMin(160); //
        favorite.setIncludedOnPlan(true);

        Movie another = new Movie();
        another.setName("John Wick");
        another.setReleaseYear(2014);
        another.setLastsInMin(101); //
        another.setIncludedOnPlan(true);

        Series series = new Series();
        series.setName("La Casa De Papel");
        series.setReleaseYear(2017);
        series.setIncludedOnPlan(true);
        series.setItsOn(true);
        series.setSeasons(5); //
        series.setEpiBySeasons(10); //
        series.setMinByEpi(45); //

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(favorite);
        calculator.include(another);
        calculator.include(series);

        System.out.println("Total time is: " + calculator.getTotalTime());

    }

}
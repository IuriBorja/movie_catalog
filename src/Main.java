import movie_catalog.models.Movie;

public class Main {
    public static void main(String[] args) {

        Movie favorite = new Movie();


        favorite.setName("Interestellar");
        favorite.setReleaseYear(2014);
        favorite.setLastsInMin(160);
        favorite.setIncludedOnPlan(true);

        favorite.showDatasheet();
        favorite.review(9);
        favorite.review(8);
        favorite.review(9);


        System.out.println("Average of the validations about the movie: " + favorite.getAverage());

    }

}
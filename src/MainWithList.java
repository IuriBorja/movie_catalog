import movie_catalog.models.Movie;
import movie_catalog.models.Series;
import movie_catalog.models.Title;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainWithList {

    public static void main(String[] args) {

        Movie favorite = new Movie("Interstellar", 2014);

        Movie another = new Movie("John Wick", 2014);

        Series series = new Series("La Casa De Papel", 2017);


        ArrayList<Title> list = new ArrayList<>();
        list.add(favorite);
        list.add(another);
        list.add(series);


        for (Title item : list) {
            System.out.println("Name: " + item.getName());

            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " + movie.getClassification());
            }

        }

        Collections.sort(list);
        System.out.println(list);


    }

}

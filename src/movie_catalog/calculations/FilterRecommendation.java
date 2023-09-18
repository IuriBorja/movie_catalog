package movie_catalog.calculations;

public class FilterRecommendation {

    public void filter(Classification classification) {

        if (classification.getClassification() >= 4) {
            System.out.println("It is among the favorites at the moment");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Very good avaliation at the moment");
        } else {
            System.out.println("Put on your list to watch after");
        }

    }
    

}

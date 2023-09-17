

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.name = "Interestellar";
        movie1.showDatasheet();


        movie1.review(2);
        movie1.review(3);
        movie1.getAverage();


    }

}
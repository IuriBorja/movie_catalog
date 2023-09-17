package movie_catalog.calculations;

import movie_catalog.models.Title;

public class TimeCalculator {

    private int totalTime;



    public void include(Title title) {
        totalTime += title.getLastsInMin();
    }

    public int getTotalTime() {
        return totalTime;
    }
}

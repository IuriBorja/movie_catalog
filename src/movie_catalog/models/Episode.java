package movie_catalog.models;

import movie_catalog.calculations.Classification;

public class Episode implements Classification {
    private int totalOfViews;

    private int number;
    private String name;
    private Series series;


    public int getTotalOfViews() {
        return totalOfViews;
    }

    public void setTotalOfViews(int totalOfViews) {
        this.totalOfViews = totalOfViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalOfViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }


}

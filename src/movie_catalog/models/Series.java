package movie_catalog.models;

public class Series extends Title{

    private int seasons;
    private int epiBySeasons;
    private boolean itsOn;
    private int minByEpi;



    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }


    @Override
    public int getLastsInMin() {
        return seasons * epiBySeasons * minByEpi;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpiBySeasons() {
        return epiBySeasons;
    }

    public void setEpiBySeasons(int epiBySeasons) {
        this.epiBySeasons = epiBySeasons;
    }

    public boolean isItsOn() {
        return itsOn;
    }

    public void setItsOn(boolean itsOn) {
        this.itsOn = itsOn;
    }

    public int getMinByEpi() {
        return minByEpi;
    }

    public void setMinByEpi(int minByEpi) {
        this.minByEpi = minByEpi;
    }

    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getReleaseYear() + ") ";
    }

}

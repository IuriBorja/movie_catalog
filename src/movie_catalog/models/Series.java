package movie_catalog.models;

public class Series extends Title{

    private int seasons;
    private int epiBySeasons;
    private boolean itsOn;
    private int minByEpi;


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
}

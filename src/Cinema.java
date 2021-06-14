/**
 * @author Kevin Juan (1972002)
 */
public class Cinema {
    private int numberOfStudio=10;
    private Film[] films;
    public Cinema() {
        Film[] isi=new Film[10];
        this.films = isi;
    }
    public Film[] getFilms(){
        return films;
    }
    public int getNumberOfStudio(){
        return numberOfStudio;
    }

    public void setNumberofStudio() {
        this.numberOfStudio-=1;
    }

    public Film[] getLongestFilm(){
        Film[] terlama =new Film[1];
        if (numberOfStudio==10){
            return null;
        }
        else{
            terlama[0]=films[0];
            for (int i=1; i<10;i++){
                if (films[i]!=null) {
                    if (terlama[0].getDuration() < films[i].getDuration()) {
                        terlama[0] = films[i];
                    }
                }
            }
            return terlama;
        }
    }
    public Film[] getShortestFilm(){
        Film []terbentar = new Film[1];
        if (numberOfStudio == 10){
            return null;
        }
        else{
            terbentar[0]=films[0];
            for (int i=1 ; i<10 ; i++){
                if (films[i] != null) {
                    if (terbentar[0].getDuration() > films[i].getDuration()) {
                        terbentar[0] = films[i];
                    }
                }
            }
            return terbentar;
        }
    }
}
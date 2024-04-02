import java.util.ArrayList;

public class FilmideKataloog {
    private String filmiNimi;
    private int valmimisaasta;
    private int kestvusMinutites;
    private String sisestajaNimi;
    private String žanr;
    private double hinnang;

    public FilmideKataloog(String filmiNimi, String sisestajaNimi, String žanr, double hinnang) {
        this.filmiNimi = filmiNimi;
        this.sisestajaNimi = sisestajaNimi;
        this.žanr = žanr;
        this.hinnang = hinnang;
    }

    public void lisaFilm(ArrayList<FilmideKataloog> filmidelist){
        filmidelist.add(this);//mdea kas saab teha nii

    }
    public String toString(){
        return filmiNimi + " - " + žanr + " - " + hinnang + " - " + sisestajaNimi;
    }
    public String kataloogtoString(ArrayList<FilmideKataloog> kataloog){
        for (int i = 0; i < kataloog.size(); i++) {
            return kataloog.get(i).toString();

        }
        return "";
    }
    public String zanriväljastamine(){
        return žanr;
    }
    public String kindlažanrikataloog(String zanr, ArrayList<FilmideKataloog> kataloog){
        for (int i = 0; i < kataloog.size(); i++) {
            if (kataloog.get(i).zanriväljastamine()==zanr){
                return kataloog.get(i).toString();
            }
        }return "";

    }
}

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        boolean lõpp = true;
        ArrayList<FilmideKataloog> kataloog = new ArrayList<FilmideKataloog>();
        while(lõpp){
            String filmilisamine = JOptionPane.showInputDialog(null, "Kas soovid lisada filmi?(y/n) ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
            if (filmilisamine.equals("y")){
                String nimi = JOptionPane.showInputDialog(null, "Sisesta enda nimi: ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                String filmiNimi = JOptionPane.showInputDialog(null, "Sisesta filmi nimi:", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                String žanr = JOptionPane.showInputDialog(null, "Sisesta filmi žanr:", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                String arvustus = JOptionPane.showInputDialog(null, "Sisesta arvustus(1-10):", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                FilmideKataloog a = new FilmideKataloog(filmiNimi,nimi,žanr,Double.parseDouble(arvustus));
                a.lisaFilm(kataloog);
                System.out.println("Film on lisatud");

            }else {
                String kasFilmideNimekiri = JOptionPane.showInputDialog(null, "Kas soovid näha filmide nimekirja?(y/n)", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                if (kasFilmideNimekiri.equals("y")) {
                    String filmideNimekiri = JOptionPane.showInputDialog(null, "Mis žanri filme soovid näha?", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);

                } else {
                    String kasLõpp = JOptionPane.showInputDialog(null, "Kas soovid lõpetada programmi kasutamise?(y/n)", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
                    if (kasLõpp.equals("y")) {
                        lõpp = false;
                    }
                }
            }
        }
    }
}

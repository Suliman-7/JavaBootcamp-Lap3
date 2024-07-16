import java.util.ArrayList;


public class Movie extends Media {

    private int duration ;

    public Movie(int duration,String title, String auteur, String ISBN, int price) {
        super(title,auteur,ISBN,price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {

        user.getPurchaseMediaList().add(this);

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> moviesCatalog) {


        ArrayList<Movie> rec = new ArrayList() ; ;

        for (Movie m : moviesCatalog) {
            if (m.getAuteur() == this.getAuteur() && !m.getISBN().equals(this.getISBN()) ) {

                rec.add(m);
            }
        }
        if(rec.size()==0) {
            System.out.println("There is no simirar movies !");
            return rec ;

        }
        else {
            return rec ;
        }
    }


    @Override
    public String getMediaType() {
        if (duration>=120) {
            return "Long Movie";

        }
        else {
            return "Movie" ;
        }
    }


    @Override
    public String toString(){


        return
                "Duration: " + getDuration() +  ", Title: " + getTitle() + " Auteur: " + getAuteur() +  " , ISBN: " + getISBN() + " , Price: " + getPrice();
    }


}
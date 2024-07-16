import java.util.ArrayList;

public class Novel extends Book {

    private String genre ;


    public Novel(String genre, int stock, ArrayList<Review> reviews,String title, String auteur, String ISBN, int price) {
        super(stock,reviews,title,auteur,ISBN,price);

        this.genre = genre;
    }



    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        if (this.getAverageRating()>=4.5) {
            return "Bestselling Novel" ;
        }
        return "Novel" ;
    }



    @Override
    public String toString(){

        return
                "Genre: "  + genre + " Stock: " + getStock() + ", Title: " + getTitle() + " Auteur: " + getAuteur() +  " , ISBN: " + getISBN() + " , Price: " + getPrice();
    }


}


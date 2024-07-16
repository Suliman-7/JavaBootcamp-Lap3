import java.util.ArrayList;

public class AcademicBook extends Book {

    private String subject ;

//    public AcademicBook(String subject) {
//        this.subject = subject;
//    }

    public AcademicBook(String subject,int stock, ArrayList<Review> reviews,String title, String auteur, String ISBN, int price) {
        super(stock,reviews,title,auteur,ISBN,price);

        this.subject = subject;
    }



    public String getSubject() {
        return subject;
    }
    public void setSubject(String genre) {
        this.subject = genre;
    }

    @Override
    public String getMediaType() {
        if (this.getAverageRating()>=4.5) {
            return "Bestselling Academic Book" ;
        }
        return "Academic Book" ;
    }

    @Override
    public String toString(){


        return
                "Subject: "  + subject + " Stock: " + getStock() + ", Title: " + getTitle() + " Auteur: " + getAuteur() +  " , ISBN: " + getISBN() + " , Price: " + getPrice();
    }
}
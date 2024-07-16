import java.util.ArrayList;



public class Book extends Media {

    private int stock;
    private ArrayList<Review> reviews;


    public Book(int stock, ArrayList<Review> reviews,String title, String auteur, String ISBN, int price) {

        super(title,auteur,ISBN,price);

        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review r) {

        getReviews().add( r ) ;

    }

    public double getAverageRating() {

        double sum = 0 ;

        ArrayList<Review> rev = new ArrayList() ;

        rev.addAll(getReviews());



        for (int i=0 ; i<rev.size() ; i++ ) {

            sum += rev.get(i).getRating() ;

        }

        if(rev.size()<=0) {
            return 0 ;
        }

        return  sum/rev.size();
    }



    public void purchase(User user){

        if (stock<=0) {
            System.out.println("there is no stock");
        }else {
            user.getPurchaseMediaList().add(this);

            stock-- ;
        }
    }

    public boolean isBestseller() {

        if (getAverageRating()>=4.5) {
            return true ;
        }
        else {
            return false ;
        }
    }


    public void restock(int quantity) {

        stock++ ;
        System.out.println("The book is restock successfully !");

    }


    @Override
    public String getMediaType() {
        if(getAverageRating() > 4.5) {
            return "Bestselling Book" ;
        }else {
            return "Book" ;
        }
    }




    @Override
    public String toString(){


        return
                "Stock: " + stock + ", Title: " + getTitle() + " Auteur: " + getAuteur() +  " , ISBN: " + getISBN() + " , Price: " + getPrice();
    }
}

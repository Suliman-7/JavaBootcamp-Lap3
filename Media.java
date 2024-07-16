public class Media {

    private String title;
    private String auteur;
    private String ISBN;
    private int price;


    public Media(String title, String auteur, String ISBN, int price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getMediaType() {
        return "Media" ;
    }


    public String toString() {
        return "Title: " + title + "Auteur: " + auteur + ", ISBN: " + ISBN + ", Price: " + price;
    }


}

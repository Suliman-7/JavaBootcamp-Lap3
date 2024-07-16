import java.util.ArrayList;


public class Music extends Media {

    private String artist ;



    public Music(String artist,String title, String auteur, String ISBN, int price) {

        super(title,auteur,ISBN,price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user) {

        user.getPurchaseMediaList().add(this);

    }



    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {

        ArrayList<Music> gen = new ArrayList() ; ;



        for (Music m : musicCatalog) {
            if (m.getAuteur().equals(this.getAuteur()) && !m.getISBN().equals(this.getISBN()) ) {

                gen.add(m);

            }


        }
        if(gen.size()==0) {
            System.out.println("There is no simirar musics !");
            return gen ;

        }else {
            return gen ;
        }
    }


    @Override
    public String getMediaType() {
        if (this.getPrice()>=10) {
            return "Premium Music";
        }
        else {
            return "Music" ;
        }
    }

    @Override
    public String toString(){


        return
                "Artist: " + getArtist() +  ", Title: " + getTitle() + " Auteur: " + getAuteur() +  " , ISBN: " + getISBN() + " , Price: " + getPrice();
    }

}

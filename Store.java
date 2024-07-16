import java.util.ArrayList;


public class Store {

    private ArrayList<User> users ;
    private ArrayList<Media> medias ;


    public Store(ArrayList<Media> medias, ArrayList<User> users) {
        this.medias = medias;
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user){

        getUsers().add(user);

    }

    public ArrayList<User> displayUsers() {

        return users ;


    }

    public void addMedia(Media media){


        getMedias().add(media);


    }

    public ArrayList<Media> displayMedia(){

        return medias;
    }



    public Media searchBook(String title) {

        Media sb = null ;



        for ( Media i : getMedias() ) {

            if ( i.getTitle() == title ) {

                sb = i;

            }

        }
        if(sb==null) {
            System.out.println("Book not found !");
            return sb ;

        }else {
            return sb ;
        }


    }

}


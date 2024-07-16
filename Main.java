import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Review> reB1 = new ArrayList() ;

        ArrayList<Review> reB2 = new ArrayList() ;

        ArrayList<Review> reAB1 = new ArrayList() ;

        ArrayList<Review> reAB2 = new ArrayList() ;

        ArrayList<Review> reN1 = new ArrayList() ;

        ArrayList<Review> reN2 = new ArrayList() ;

        ArrayList<Media> shCart = new ArrayList() ;

        ArrayList<Media> puList = new ArrayList() ;

        ArrayList<Media> shCart2 = new ArrayList() ;

        ArrayList<Media> puList2 = new ArrayList() ;

        ArrayList<Book> bk = new ArrayList() ;

        ArrayList<Movie> mv = new ArrayList() ;

        ArrayList<Music> mc = new ArrayList() ;

        ArrayList<Media> medias = new ArrayList() ;

        ArrayList<User> users = new ArrayList() ;


        Media m1 = new Media("Game" , "William" , "RE326F" , 44 ) ;




        Music mc1 = new Music("carl", "Music" , "US" , "12345" , 500);

        Music mc2 = new Music("steeve", "aaa" , "UK" , "23465" , 9);

        Music mc3 = new Music("steeve", "aaa" , "UK" , "45422" , 100);

        mc.add(mc1);
        mc.add(mc2);
        mc.add(mc3);


        Movie mv1 = new Movie(120,"Bad Boys","Netflix","49020",220);

        Movie mv2 = new Movie(100,"Uncharted","Fox","30302",500);

        Movie mv3 = new Movie(200,"Fight Club","Fox","03924",300);

        mv.add(mv1);
        mv.add(mv2);
        mv.add(mv3);


        Review r1 = new Review("Salem" , "Not Good" , 5);

        Review r2 = new Review("Ahmed" ,  "Good" , 8);

        Review r3 = new Review("Khalid" ,  "bad" , 3);


        User U1 = new User ("Mohammed" , "Moha@email.com" , shCart , puList ) ;

        User U2 = new User ("Nasser" , "nass@email.com" , shCart2 , puList2 ) ;


        Book b1 = new Book(10,reB1,"Alchimist","john","139QF62",100) ;

        Book b2 = new Book(4,reB2,"Lets go","dev","393920D",20) ;


        Store S1 = new Store(medias,users) ;

        AcademicBook ab1 = new AcademicBook("Sport",4,reAB1,"Liverpool","Mike","S25G4U",199);

        AcademicBook ab2 = new AcademicBook("History",7,reAB2,"Spain","Carl","W22B5R",90);

        Novel n1 = new Novel("drama",2,reN1,"England","chris","CT55H7",11);

        Novel n2 = new Novel("comedy",1,reN2,"France","sky","VE47N3",70);



        System.out.println("---------------------------------");

        System.out.println("-------------Media---------------");


        System.out.println(m1.getAuteur());

        System.out.println(m1.getMediaType());









        System.out.println("---------------------------------");

        System.out.println("-------------Book----------------");


        b1.addReview(r1);
        b1.addReview(r2);
        b1.addReview(r3);
        b1.purchase(U1);


        b2.addReview(r3);


        System.out.println(b1.getAverageRating());




        System.out.println(b1.getMediaType());

        System.out.println(b2.getMediaType());



        System.out.println(b1.toString());

        System.out.println(b2.toString());




        b1.restock(2);


        System.out.println(b1.toString());

        System.out.println(b1.getPrice());

        System.out.println(b1.getAverageRating());

        System.out.println(b1.getMediaType());

        System.out.println(b2.getMediaType());



        System.out.println("---------------------------------");
        System.out.println("----------Academic Book----------");


        ab1.addReview(r2);

        System.out.println(ab1.getAverageRating());

        System.out.println(ab1.getPrice());

        System.out.println(ab1.toString());

        System.out.println(ab2.getAverageRating());

        System.out.println(ab2.isBestseller());

        System.out.println(ab1.getMediaType());

        System.out.println(ab2.getMediaType());








        System.out.println("---------------------------------");
        System.out.println("---------------Novel-------------");


        n1.addReview(r3);

        n2.addReview(r2);



        System.out.println(n1.getAverageRating());

        System.out.println(n1.getPrice());

        System.out.println(n1.toString());

        System.out.println(n1.getMediaType());

        System.out.println(n2.getMediaType());







        System.out.println("---------------------------------");

        System.out.println("-------------Music---------------");


        mc1.getMediaType();

        mc1.listen(U1);

        mc2.listen(U2);

        System.out.println(mc1.generatePlaylist(mc));

        System.out.println(mc3.generatePlaylist(mc));


        System.out.println(mc2.toString());

        System.out.println(mc1.getMediaType());

        System.out.println(mc2.getMediaType());




        System.out.println("-----------------------------");

        System.out.println("-----------Movie-------------");

        mv1.setPrice(99);



        System.out.println(mv2.recommendSimilarMovies(mv));


        System.out.println(mv3.toString());

        System.out.println(mv1.toString());

        System.out.println(mv2.getMediaType());

        System.out.println(mv3.getMediaType());















        System.out.println("---------------------------------");

        System.out.println("--------------User---------------");



        U1.addToCart(b1);

        U1.checkout();

        U1.removeFromCart(b1);


        U2.addToCart(b1);


        U2.checkout();



        System.out.println(U1.toString());
        System.out.println(U2.toString());




        System.out.println("---------------------------------");
        System.out.println("-------------Store---------------");


        S1.addUser(U1);


        System.out.println(S1.getUsers());

        S1.addMedia(b1);


        System.out.println(S1.getMedias());

        System.out.println(S1.displayMedia());

        System.out.println(S1.displayUsers());

        System.out.println(S1.searchBook("Alchimist"));

        System.out.println(S1.searchBook("Star Wars"));


    }

}
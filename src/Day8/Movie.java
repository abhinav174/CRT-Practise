package Day8;

class MovieExample{
    private String title;
    private String director ;
    private double rating ;

    public MovieExample(String title, String director, double rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
        setRating(rating);
    }
    public String getTitle(){
       return title ;
    }

    public String getDirector(){
       return  director ;
    }

    public double getRating(){
       return rating ;
    }

    public void setRating(double newRating){
        if(newRating >=0 && newRating <=10)
            rating = newRating;
        else
            System.out.println("Invalid Rating");
    }
}
public class Movie {
    public static void main(String[] args) {
        MovieExample m = new MovieExample("Inception","Christopher Nolan",9.0);
//
        m.setRating(-1);
        System.out.println(m.getTitle());
        System.out.println(m.getDirector());
        System.out.println(m.getRating());
    }
}

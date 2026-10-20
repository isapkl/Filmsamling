import java.util.ArrayList;

public class Controller {
    private MovieCollection movieCollection = new MovieCollection();

    public static void addMovie(String title, String director, String genre, int yearCreated, boolean inColor, int lengthInMinutes){
       // MovieCollection.addMovie(title, director, genre, yearCreated, inColor, lengthInMinutes);
    }

    public ArrayList<Movie> getMovies(){
        return movieCollection.getMovies();
    }

    public ArrayList<Movie> searchMovies(String searchtext){
        return movieCollection.searchMovies(searchtext);
    }

    public boolean editMovie(Movie movie, String title, String genre,String director, int yearCreated, boolean inColor, int lengthInMinutes){
        return movieCollection.editMovie(movie, title, genre, yearCreated, inColor, lengthInMinutes, director);
    }

    public boolean deleteMovie(Movie movie){
        return movieCollection.deleteMovie(movie);
    }
    //Det eneste, UserInterface taler med. Sender videre til MovieCollection
    //Må ikke: udskrive eller læse input
}

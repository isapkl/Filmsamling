import java.util.ArrayList;

public class Controller {
    private MovieCollection movieCollection = new MovieCollection();

    public void addMovie(String title, String director, String genre, int yearCreated, boolean inColor, int lengthInMinutes){
        MovieCollection.addMovie(title, director, genre, yearCreated, inColor, lengthInMinutes);
    }

    public ArrayList<Movie> getMovies(){
        return null;
    }

    public ArrayList<Movie> searchMovies(String searchtext){
        return null;
    }

    public boolean editMovie(Movie movie, String title, String genre){
        return false;
    }

    public boolean deleteMovie(Movie movie){
        return false;
    }
    //Det eneste, UserInterface taler med. Sender videre til MovieCollection
    //Må ikke: udskrive eller læse input
}

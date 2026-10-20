import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movies = new ArrayList<>();


    public void addMovie(String title, String genre){

    }

    public ArrayList<Movie> getMovies(){
        return null;
    }

    public int getNumberOfMovies(){
        return 0;
    }

    // Finder alle film, hvor søgeteksten indgår i titlen – uanset store og små bogstaver
    public ArrayList<Movie> searchMovies(String searchText) {
        ArrayList<Movie> matches = new ArrayList<>();
        String text = searchText.toLowerCase();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(text)) {
                matches.add(movie);
            }
        }
        return matches;
    }

    public boolean editMovie(Movie movie, String title, String genre){
        return false;
    }

    public boolean deleteMovie(Movie movie){
        return false;
    }

    //Ejer listen af film: opretter, finder, retter og fjerner
    //Må ikke: udskrive eller læse input
}

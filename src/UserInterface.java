import java.util.Scanner;

public class UserInterface {
    private Controller controller = new Controller();




    //Menuen kører i en løkke i startProgram(), indtil brugeren vælger at afslutte.
    //Læs menuvalget som tekst og brug en switch på teksten –
    // så går programmet ikke ned, hvis brugeren skriver hej i stedet for et tal:

    private Scanner scanner;
    String choice = scanner.nextLine().trim();
//    switch (choice) {
//        case "1" -> createMovie();
//        case "2" -> showAllMovies();
//        case "3" -> searchMovies();
//        case "4" -> editMovie();
//        case "5" -> deleteMovie();
//        case "0" -> running = false;
//        default -> System.out.println("Ukendt valg: " + choice);
//    }



    //Al kommunikation med brugeren: Menu, System.out og Scanner findes kun i UserInterface
    //Må ikke: holde på film eller ændre dem selv
}

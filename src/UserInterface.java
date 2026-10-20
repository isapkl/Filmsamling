import java.util.Scanner;

public class UserInterface {
    private Controller controller;
    private Scanner scanner = new Scanner(System.in);
    boolean running = true;


    public UserInterface() {
        controller = new Controller();
    }
    //Menuen kører i en løkke i startProgram(), indtil brugeren vælger at afslutte.
    //Læs menuvalget som tekst og brug en switch på teksten –
    // så går programmet ikke ned, hvis brugeren skriver hej i stedet for et tal:

    public void startProgram(){

    while (running){

        System.out.println("Velkommen til min filmsamling!");
        System.out.println();
        System.out.println("1. Opret en film");
        System.out.println("2. Vis alle film");
        System.out.println("3. Søg efter en film");
        System.out.println("4. Redigér en film");
        System.out.println("5. Fjern en film");
        System.out.println("0. Afslut programmet");
        System.out.print("Vælg en mulighed: ");

        String choice = scanner.nextLine().trim();
        switch (choice) {
//            case "1" -> controller.createMovie();
//            case "2" -> controller.showAllMovies();
            case "3" -> controller.searchMovies(choice);
//            case "4" -> controller.editMovie();
//            case "5" -> controller.deleteMovie();
            case "0" -> {
                running = false;
                System.out.println("Programmet afsluttes.");
            }
            default -> System.out.println("Ukendt valg: " + choice);
        }
    }
    }



    //Al kommunikation med brugeren: Menu, System.out og Scanner findes kun i UserInterface
    //Må ikke: holde på film eller ændre dem selv
}

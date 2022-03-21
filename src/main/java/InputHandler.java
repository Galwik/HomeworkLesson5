import java.util.Scanner;

public class InputHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println();
        System.out.println("1 – Search movies by date");
        System.out.println("2 – Print random movie");
        System.out.println("3 – Search movie by actor name");
        System.out.println("4 – End program");
        System.out.println();
    }

    public static void ask() {

        boolean end;
        do {
            end = false;
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    int[] years = getDateFromUser();
                    Main.movieLibrary.searchMovieByDate(years[0], years[1]);
                    break;
                case 2:
                    Main.movieLibrary.printRandomMovie();
                    break;
                case 3:
                    Main.movieLibrary.searchMovieByActorName(getActorFromUser());
                    break;
                case 4:
                    end = true;
                    break;
                default:
                    System.out.println("choose from 1 to 4");
                    break;
            }
        } while (!end);
    }

    public static int[] getDateFromUser() {
        int[] years = new int[2];
        System.out.println("From year:");
        years[0] = scanner.nextInt();
        System.out.println("To year:");
        years[1] = scanner.nextInt();

        return years;
    }

    public static Actor getActorFromUser() {
        scanner.nextLine();
        System.out.println("Enter actor first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter actor last name");
        String lastName = scanner.nextLine();

        return new Actor(firstName, lastName);
    }
}
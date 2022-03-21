import java.io.File;
import java.io.IOException;

public class Main {
    public static MovieLibrary movieLibrary = new MovieLibrary();
    static File path = new File("src/main/resources/movies.json");

    public static void main(String[] args) throws IOException {
        movieLibrary = DeserializerJsonToObject.getMoviesToList(path);
        InputHandler.ask();
    }
}
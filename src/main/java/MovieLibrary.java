import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {

    private List<Movie> movies;


    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void searchMovieByDate(int start, int end) {
        System.out.println("Your movies:");
        for (Movie movie : movies) {
            if (movie.getDate() >= start && movie.getDate() <= end) {
                System.out.println(movie);
            }
        }
    }

    public void printRandomMovie() {
        System.out.println("Your random movie:");
        System.out.println(movies.get(new Random().nextInt(movies.size())).toString());
    }

    public void searchMovieByActorName(Actor actor) {
        System.out.println("Your movies:");
        movies.stream()
                .filter(m -> m.getActors().stream()
                        .anyMatch(
                                a -> a.getFirstName().equalsIgnoreCase(actor.getFirstName())
                                        && a.getLastName().equalsIgnoreCase(actor.getLastName())))
                .collect(Collectors.toList()).forEach(m -> System.out.println(m.getTitle() + ", "));
    }
}
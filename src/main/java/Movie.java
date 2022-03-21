import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actor> actors;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "title: " + title +
                "\n   director: " + director +
                "\n   genre: " + genre +
                "\n   date: " + date +
                "\n   actors: " + actors;
    }
}
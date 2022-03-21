import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DeserializerJsonToObject {

    public static MovieLibrary getMoviesToList(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, MovieLibrary.class);
    }
}
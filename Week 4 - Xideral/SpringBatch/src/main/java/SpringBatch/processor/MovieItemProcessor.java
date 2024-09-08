package SpringBatch.processor;

import SpringBatch.model.Movie;
import org.springframework.batch.item.ItemProcessor;

public class MovieItemProcessor implements ItemProcessor<Movie, Movie> {

    @Override
    public Movie process(Movie movie) throws Exception {
        return movie;
    }
}


package SpringBatch.reader;


import SpringBatch.model.Movie;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;

public class MovieItemReader {

    public FlatFileItemReader<Movie> reader() {
        return new FlatFileItemReaderBuilder<Movie>()
                .name("movieItemReader")
                .resource(new ClassPathResource("movies.csv"))
                .delimited()
                .names("title", "director", "releaseYear")
                .targetType(Movie.class)
                .build();
    }
}


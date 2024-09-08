package SpringBatch.writer;

import SpringBatch.model.Movie;
import SpringBatch.repository.MovieRepository;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieItemWriter implements ItemWriter<Movie> {

    @Autowired
    private MovieRepository movieRepository;

    public void write(List<? extends Movie> items) throws Exception {
        movieRepository.saveAll(items);
    }

	@Override
	public void write(Chunk<? extends Movie> chunk) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

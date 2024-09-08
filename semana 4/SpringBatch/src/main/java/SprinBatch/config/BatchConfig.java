package SprinBatch.config;

import SpringBatch.model.Movie;
import SpringBatch.processor.MovieItemProcessor;
import SpringBatch.reader.MovieItemReader;
import SpringBatch.writer.MovieItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @SuppressWarnings("removal")
	@Autowired
    private JobBuilderFactory jobBuilderFactory;

    @SuppressWarnings("removal")
	@Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<Movie> reader() {
        return new FlatFileItemReaderBuilder<Movie>()
                .name("movieItemReader")
                .resource(new ClassPathResource("movies.csv"))
                .delimited()
                .names(new String[]{"title", "director", "releaseYear"})
                .targetType(Movie.class)
                .build();
    }

    @Bean
    public MovieItemProcessor processor() {
        return new MovieItemProcessor();
    }

    @Bean
    public MovieItemWriter writer() {
        return new MovieItemWriter();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Movie, Movie>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    public Job importMovieJob() {
        return jobBuilderFactory.get("importMovieJob")
                .start(step1())
                .build();
    }
}


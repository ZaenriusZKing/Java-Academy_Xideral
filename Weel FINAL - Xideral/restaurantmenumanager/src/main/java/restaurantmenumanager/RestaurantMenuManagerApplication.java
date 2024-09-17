package restaurantmenumanager;

import restaurantmenumanager.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantMenuManagerApplication implements CommandLineRunner {

    @Autowired
    private DishService dishService;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantMenuManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dishService.loadInitialData();
    }
}

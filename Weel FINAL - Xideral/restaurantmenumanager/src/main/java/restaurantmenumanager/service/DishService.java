package restaurantmenumanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurantmenumanager.model.Dish;
import restaurantmenumanager.repository.DishRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    @Autowired
    private DishRepository dishRepository;

    // Método para obtener todos los platos
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    // Método para obtener un plato por su ID
    public Dish getDishById(Long id) {
        Optional<Dish> dish = dishRepository.findById(id);
        return dish.orElse(null);
    }
    
    // Método para pre-cargar datos
    public void loadInitialData() {
        dishRepository.save(new Dish("Pizza Margherita", 9.99, "Tomato, Mozzarella, Basil"));
        dishRepository.save(new Dish("Pasta Carbonara", 12.99, "Spaghetti, Bacon, Egg, Cheese"));
        dishRepository.save(new Dish("Caesar Salad", 8.99, "Romaine, Chicken, Parmesan, Croutons"));
        dishRepository.save(new Dish("Margherita Pizza", 10.99, "Tomato, Mozzarella, Basil"));
        dishRepository.save(new Dish("Spaghetti Bolognese", 11.99, "Spaghetti, Ground Beef, Tomato Sauce"));
        dishRepository.save(new Dish("Vegetable Stir Fry", 9.49, "Mixed Vegetables, Soy Sauce, Ginger"));
        dishRepository.save(new Dish("Beef Tacos", 10.49, "Ground Beef, Lettuce, Tomato, Cheese"));
        dishRepository.save(new Dish("Chicken Curry", 12.49, "Chicken, Curry Sauce, Rice"));
        dishRepository.save(new Dish("Sushi Rolls", 14.99, "Rice, Fish, Seaweed, Vegetables"));
        dishRepository.save(new Dish("Grilled Salmon", 15.99, "Salmon, Lemon, Herbs"));
    }
}

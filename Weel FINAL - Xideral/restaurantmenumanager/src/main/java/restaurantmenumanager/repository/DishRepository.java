package restaurantmenumanager.repository;

import restaurantmenumanager.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}


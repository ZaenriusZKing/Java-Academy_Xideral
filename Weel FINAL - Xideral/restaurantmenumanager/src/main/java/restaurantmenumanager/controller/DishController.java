package restaurantmenumanager.controller;

import restaurantmenumanager.model.Dish;
import restaurantmenumanager.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dishes")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDishById(@PathVariable Long id) {
        Dish dish = dishService.getDishById(id);
        return dish != null ? ResponseEntity.ok(dish) : ResponseEntity.notFound().build();
    }
    
    @GetMapping
    public ResponseEntity<List<Dish>> getAllDishes() {
        List<Dish> dishes = dishService.getAllDishes();
        return ResponseEntity.ok(dishes);
    }

}

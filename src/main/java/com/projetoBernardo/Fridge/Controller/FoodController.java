package com.projetoBernardo.Fridge.Controller;

import com.projetoBernardo.Fridge.Model.Food;
import com.projetoBernardo.Fridge.Service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //POST
    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.create(food);
    }

    //GET
    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    //DELETE
    @DeleteMapping
    public void delete(int id) {}

}

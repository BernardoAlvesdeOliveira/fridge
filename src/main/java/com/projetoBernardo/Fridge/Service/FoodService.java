package com.projetoBernardo.Fridge.Service;

import com.projetoBernardo.Fridge.Model.Food;
import com.projetoBernardo.Fridge.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Criar
    public Food create(Food food) {
        return foodRepository.save(food);
    }

    // Listar
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    // Deletar
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

}

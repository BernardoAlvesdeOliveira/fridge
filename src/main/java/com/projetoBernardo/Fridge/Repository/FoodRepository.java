package com.projetoBernardo.Fridge.Repository;

import com.projetoBernardo.Fridge.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

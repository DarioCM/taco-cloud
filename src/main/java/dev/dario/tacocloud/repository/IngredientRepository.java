package dev.dario.tacocloud.repository;

import dev.dario.tacocloud.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository
        extends JpaRepository<Ingredient, String> {
}

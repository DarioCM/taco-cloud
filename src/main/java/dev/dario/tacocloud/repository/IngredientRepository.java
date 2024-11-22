package dev.dario.tacocloud.repository;

import dev.dario.tacocloud.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
extends CrudRepository<Ingredient, String> {
}

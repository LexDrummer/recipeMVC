package ru.lexdrummer.recipemvc.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.recipemvc.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

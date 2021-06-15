package ru.lexdrummer.recipemvc.services;

import org.springframework.stereotype.Service;
import ru.lexdrummer.recipemvc.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}

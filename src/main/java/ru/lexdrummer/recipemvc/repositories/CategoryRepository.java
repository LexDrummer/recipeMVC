package ru.lexdrummer.recipemvc.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.recipemvc.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}

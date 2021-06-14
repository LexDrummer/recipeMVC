package ru.lexdrummer.recipemvc.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.recipemvc.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}

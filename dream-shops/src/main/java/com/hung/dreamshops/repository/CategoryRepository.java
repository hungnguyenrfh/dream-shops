package com.hung.dreamshops.repository;

import com.hung.dreamshops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Category findByName(String name);

    boolean existByName(String name);
}
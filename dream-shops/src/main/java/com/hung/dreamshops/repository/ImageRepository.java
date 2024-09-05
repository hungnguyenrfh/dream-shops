package com.hung.dreamshops.repository;

import com.hung.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
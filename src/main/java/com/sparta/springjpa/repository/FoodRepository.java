package com.sparta.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sparta.springjpa.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}

package com.sda.project.repository;

import com.sda.project.model.CalorieCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalorieCountRepository extends JpaRepository<CalorieCount, Long> {

}

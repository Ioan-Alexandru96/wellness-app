package com.sda.project.repository;

import com.sda.project.model.IdealWeight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdealWeightRepository extends JpaRepository<IdealWeight, Long>{

}

package edu.eurotrans.dao.repository.jpa;

import edu.eurotrans.dao.entity.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckJpaRepository extends JpaRepository<TruckEntity, Long> {
}

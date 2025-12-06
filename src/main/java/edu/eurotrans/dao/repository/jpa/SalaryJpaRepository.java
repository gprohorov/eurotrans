package edu.eurotrans.dao.repository.jpa;

import edu.eurotrans.dao.entity.WorkTripSalaryHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryJpaRepository extends JpaRepository<WorkTripSalaryHistoryEntity, Long> {
}

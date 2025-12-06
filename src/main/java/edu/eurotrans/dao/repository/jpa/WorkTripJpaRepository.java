package edu.eurotrans.dao.repository.jpa;

import edu.eurotrans.dao.entity.WorkTripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkTripJpaRepository extends JpaRepository<WorkTripEntity, Long> {

	WorkTripEntity findFirstByEmployeeEmailAndActive(String email, boolean active);

	List<WorkTripEntity> findAllBySalaryTypeAndActiveTrue(Integer salaryType);
}

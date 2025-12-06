package edu.eurotrans.dao.repository.jpa;

import edu.eurotrans.dao.entity.EmployeeExpensesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpensesJpaRepository extends JpaRepository<EmployeeExpensesEntity, Long> {

	List<EmployeeExpensesEntity> findAllByTripId(Long tripId);
}

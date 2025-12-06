package edu.eurotrans.dao.repository.jpa;

import edu.eurotrans.dao.entity.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyJpaRepository extends JpaRepository<CurrencyEntity, Long> {
}

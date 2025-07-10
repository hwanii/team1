package bitc.full502.team1.domain.repository;

import bitc.full502.team1.domain.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity , Integer> {
}

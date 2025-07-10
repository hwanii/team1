package bitc.full502.team1.domain.repository;

import bitc.full502.team1.domain.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer> {
}

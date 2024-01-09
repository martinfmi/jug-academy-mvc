package bg.jug.forex.repository;

import bg.jug.forex.model.entity.ExRateEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExRateRepository extends JpaRepository<ExRateEntity, Long> {
  Optional<ExRateEntity> findByCurrency(String currency);
}

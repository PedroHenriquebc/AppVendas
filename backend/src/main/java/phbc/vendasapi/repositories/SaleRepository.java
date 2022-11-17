package phbc.vendasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phbc.vendasapi.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}

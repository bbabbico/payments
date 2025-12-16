package projectweb.payments;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OdersRepository extends JpaRepository<Orders,Integer> {
}

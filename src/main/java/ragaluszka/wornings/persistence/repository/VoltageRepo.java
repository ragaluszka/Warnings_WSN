package ragaluszka.wornings.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ragaluszka.wornings.persistence.model.Voltage;

public interface VoltageRepo extends JpaRepository<Voltage,Long>, JpaSpecificationExecutor<Voltage> {
}

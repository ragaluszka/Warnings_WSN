package ragaluszka.wornings.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ragaluszka.wornings.persistence.model.BaseEntity;
import ragaluszka.wornings.persistence.model.Voltage;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity,K extends Serializable>
        extends JpaRepository<T,K>, JpaSpecificationExecutor<T> {
}

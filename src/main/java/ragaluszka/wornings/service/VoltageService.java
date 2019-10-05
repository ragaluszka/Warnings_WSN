package ragaluszka.wornings.service;

import ragaluszka.wornings.model.VoltageDTO;
import ragaluszka.wornings.persistence.model.Voltage;
import ragaluszka.wornings.persistence.repository.VoltageRepo;

import java.util.List;
//public interface VoltageService<T> extends BaseService<Voltage,Long, VoltageRepo>

public interface VoltageService extends BaseService<Voltage,Long, VoltageRepo> {
     VoltageDTO getVoltageDTOById (Long id);
    // VoltageDTO createVoltage (VoltageDTO voltageDTO);
   //  List<VoltageDTO>getAllVoltage();
}

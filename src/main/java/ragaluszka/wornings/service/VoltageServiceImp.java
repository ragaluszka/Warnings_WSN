package ragaluszka.wornings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ragaluszka.wornings.model.VoltageDTO;
import ragaluszka.wornings.persistence.model.Voltage;
import ragaluszka.wornings.persistence.repository.VoltageRepo;

import java.util.List;
import java.util.stream.Collectors;

//public class VoltageServiceImp extends BaseServiceImp<Voltage,Long, VoltageRepo> implements VoltageService
@Service
public class VoltageServiceImp extends BaseServiceImp<Voltage,Long, VoltageRepo> implements VoltageService{

    @Autowired
    private VoltageRepo voltageRepo;

    @Override
    public VoltageRepo getRepository() {
        return voltageRepo;
    }

    @Override
    public VoltageDTO getVoltageDTOById(Long id) {
        return Mapper.voltageToVoltageDTO(getOne(id));
    }


    @Override
    public VoltageDTO createVoltage(VoltageDTO voltageDTO) {
        Voltage v = save(Mapper.VoltageDTOToVoltage(voltageDTO));
        return Mapper.voltageToVoltageDTO(v);
    }
    /*
    @Override
    public List<VoltageDTO> getAllVoltage() {
        return getAll().stream()
                .map(Mapper::voltageToVoltageDTO)
                .collect(Collectors.toList());
    }
     */
}

package ragaluszka.wornings.service;

import ragaluszka.wornings.model.VoltageDTO;
import ragaluszka.wornings.persistence.model.Voltage;

public class Mapper {
    public static VoltageDTO voltageToVoltageDTO(Voltage voltage){
        VoltageDTO voltageDTO =new VoltageDTO();
        voltageDTO.setId(voltage.getId());
        voltageDTO.setName(voltage.getName());
        return voltageDTO;
    }

    public static Voltage VoltageDTOToVoltage(VoltageDTO voltageDTO){
        Voltage voltage =new Voltage();
        //voltage.setId(voltageDTO.getId());
        voltage.setName(voltageDTO.getName());
        return voltage;
    }
}

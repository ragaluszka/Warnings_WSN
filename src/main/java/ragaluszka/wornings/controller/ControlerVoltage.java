package ragaluszka.wornings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ragaluszka.wornings.model.VoltageDTO;
import ragaluszka.wornings.exception.WrongException;
import ragaluszka.wornings.persistence.model.Voltage;
import ragaluszka.wornings.persistence.repository.VoltageRepo;
import ragaluszka.wornings.service.Mapper;
import ragaluszka.wornings.service.VoltageService;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/warnings")
public class ControlerVoltage {

    private List<VoltageDTO> listaVoltage = new ArrayList<>();
    @Autowired
    VoltageService voltageService;
    //VoltageRepo voltageRepo;



    @RequestMapping(value = "/createVoltage", method = RequestMethod.POST)
    public ResponseEntity<VoltageDTO> createVoltage(@RequestBody VoltageDTO voltageDTO){
        if (voltageDTO.getId() != null ) throw new WrongException("Voltage nie może mieć ID");
        //listaVoltage.add(voltage);
        System.out.println("dodanie poziomu napięcia: /warnings/createvoltage : "+voltageDTO.getName());
        VoltageDTO vDTO = voltageService.createVoltage(voltageDTO);
     return new ResponseEntity<>(vDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value = "add/{id}", method = RequestMethod.GET)
    public VoltageDTO buyCourse(@PathVariable(value = "id") Long id) {
        System.out.println("add Voltage");
        Voltage voltage = new Voltage();
        voltage.setName("voltTest");
         voltageService.save(voltage);
        //return voltageService.getVoltageDTOById(id);
       return null;
    }

    @RequestMapping(value = "/listsVoltage", method = RequestMethod.GET)
    public ResponseEntity<List<VoltageDTO>> listsVoltage(){
        return new ResponseEntity<>(voltageService.getAllVoltage(), HttpStatus.OK);
    }

    //http:/......./getVoltage/1
    @RequestMapping(value = "/getVoltage/{id}", method = RequestMethod.GET)
    public VoltageDTO getVoltage(@PathVariable(value = "id") Long id){
        System.out.println("Voltage");
        Voltage v=voltageService.getOne(id);
        return Mapper.voltageToVoltageDTO(v);
    }

    //Secend try http:/......./?id=1
    @RequestMapping(value = "/getVoltage", method = RequestMethod.POST)
    public VoltageDTO getVoltage2(@PathParam(value = "id") int id){
        System.out.println("Voltage2");
        return findVoltage(id);
    }

    private VoltageDTO findVoltage(int id) {
        VoltageDTO voltageDTO = null;
        for (VoltageDTO vol : listaVoltage )
        {
            if (vol.getId().equals(id)) voltageDTO =  vol;
            break;
        }
        if(voltageDTO ==null){
            //TODO
        }
        return voltageDTO;
    }

}

package ragaluszka.wornings;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/warnings")
public class ControlerVoltage {

    private List<Voltage> listaVoltage = new ArrayList<>();


    @RequestMapping(value = "/createVoltage", method = RequestMethod.POST)
    public ResponseEntity<Voltage> createVoltage(@RequestBody Voltage voltage){
        if (voltage.getId()==null || voltage.getId()<0) throw new WrongException("ID null lub mniejsze od 0");
        listaVoltage.add(voltage);
     System.out.println(voltage.getName());
     return new ResponseEntity<>(voltage, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/listaVoltage", method = RequestMethod.GET)
    public ResponseEntity<List<Voltage>> listaVoltage(){
        return new ResponseEntity<>(listaVoltage, HttpStatus.OK);
    }

    //http:/......./getVoltage/1
    @RequestMapping(value = "/getVoltage/{id}", method = RequestMethod.POST)
    public Voltage getVoltage(@PathVariable(value = "id") Long id){
        System.out.println("Voltage");
        return findVoltage(id);
    }

    //Secend try http:/......./?id=1
    @RequestMapping(value = "/getVoltage", method = RequestMethod.POST)
    public Voltage getVoltage2(@PathParam(value = "id") Long id){
        System.out.println("Voltage2");
        return findVoltage(id);
    }

    private Voltage findVoltage(Long id) {
        Voltage voltage = null;
        for (Voltage vol : listaVoltage )
        {
            if (vol.getId().equals(id)) voltage =  vol;
            break;
        }
        if(voltage==null){
            //TODO
        }
        return voltage;
    }

}

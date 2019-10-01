package ragaluszka.wornings;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/warnings")
public class ControlerVoltage {

    @RequestMapping(value = "/createVoltage", method = RequestMethod.POST)
    public ResponseEntity<Long> createVoltage(@RequestBody Voltage voltage){
     System.out.println(voltage.getName());
     return new ResponseEntity<>(0L, HttpStatus.ACCEPTED);
    }

}

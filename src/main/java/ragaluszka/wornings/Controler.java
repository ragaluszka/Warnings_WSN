package ragaluszka.wornings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controler {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Hello(){
        return "hello";
    }
}

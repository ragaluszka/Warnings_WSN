package ragaluszka.wornings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controler {
    @RequestMapping(value = "/hellow", method = RequestMethod.GET)
    public String Hello(){
        User user = new User();
        user.setFirstName("John");
        return "hello";
    }



}

package ragaluszka.wornings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ragaluszka.wornings.model.UserDTO;

@RestController
@RequestMapping(value = "/")
public class Controler {
    @RequestMapping(value = "/hellow", method = RequestMethod.GET)
    public String Hello(){
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("John");
        return "hello";
    }



}

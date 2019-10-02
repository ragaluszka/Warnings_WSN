package ragaluszka.wornings.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ragaluszka.wornings.model.UserDTO;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public UserDTO registry(@RequestBody UserDTO userDTO){
            return userDTO;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public UserDTO add(@RequestBody UserDTO userDTO) {
        return userDTO;
    }
    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public UserDTO confirm(@RequestBody UserDTO userDTO) {
        return userDTO;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public UserDTO edit(@RequestBody UserDTO userDTO) {
        return userDTO;
    }


}

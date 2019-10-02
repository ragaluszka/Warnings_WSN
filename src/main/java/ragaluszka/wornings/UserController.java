package ragaluszka.wornings;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User registry(@RequestBody User user){
            return user;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        return user;
    }
    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public User confirm(@RequestBody User user) {
        return user;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public User edit(@RequestBody User user) {
        return user;
    }


}

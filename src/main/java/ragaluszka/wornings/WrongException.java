package ragaluszka.wornings;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongException extends RuntimeException {
    public WrongException(String s) {
        super(s);
    }
}

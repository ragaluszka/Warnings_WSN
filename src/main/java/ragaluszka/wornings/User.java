package ragaluszka.wornings;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String Department;
    private String password;
    private Boolean isAuthor;
    private Boolean isAdmin;
}

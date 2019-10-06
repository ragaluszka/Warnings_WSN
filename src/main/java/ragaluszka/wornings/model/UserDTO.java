package ragaluszka.wornings.model;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String Department;
    private String password;
    private Boolean isAuthor;
    private Boolean isAdmin;
}

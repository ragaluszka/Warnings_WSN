package ragaluszka.wornings.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Voltage")
public class Voltage {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}

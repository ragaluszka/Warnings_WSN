package ragaluszka.wornings.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "Voltage")
public class Voltage extends BaseEntity{
    /* Extract to BaseEntity
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;
    */

    @Column(name = "name")
    private String name;
}

package ragaluszka.wornings.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;

    @Column(name="avtive")
    private Boolean active;

    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    //Before created Data
    @PrePersist
    protected void loadBeforeInsert()
    {
        this.active = true;
        this.createdDate = new Date();
        this.updatedDate = new Date();
    }
    //Before update Data
    @PreUpdate
    protected void loadBeforeUpdated()
    {
        this.updatedDate = new Date();
    }




}

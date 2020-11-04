package hello.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "challenger")
@Data
public class Challenger implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cgr_id", nullable = false)
    private String cgrId;

    @Column(name = "cgr_name", nullable = false)
    private String cgrName;

    @Column(name = "cgr_health")
    private Integer cgrHealth;

    @Column(name = "cgr_magic")
    private Integer cgrMagic;

    @Column(name = "cgr_trick")
    private String cgrTrick;

    @Column(name = "cgr_attr")
    private String cgrAttr;

}

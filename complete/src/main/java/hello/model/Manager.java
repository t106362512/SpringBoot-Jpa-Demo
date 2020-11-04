package hello.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "manager")
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "mgr_id", nullable = false)
    private String mgrId;

    @Column(name = "mgr_name", nullable = false)
    private String mgrName;

    @Column(name = "mgr_trick")
    private String mgrTrick;

    @Column(name = "mgr_hold")
    private Integer mgrHold;

    @Column(name = "mgr_health")
    private Integer mgrHealth;

    @Column(name = "mgr_magic")
    private Integer mgrMagic;

    @Column(name = "mgr_attr")
    private String mgrAttr;

}

package hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Accessors(chain = true)
@Table(name = "record")
public class Record {

    @Column(name = "cgr_id")
    private String cgrId;

    @Column(name = "mgr_id", nullable = false)
    private String mgrId;

    @Id
    @Column(name = "btl_id", nullable = false)
    private String btlId;

    @Column(name = "rcd_site")
    private String rcdSite;

    @Column(name = "rcd_winner")
    private String rcdWinner;

    @Column(name = "rcd_record")
    private String rcdRecord;

//    @OneToOne(cascade=ALL)
//    private Battle battle;
}

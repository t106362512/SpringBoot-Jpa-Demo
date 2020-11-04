package hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Accessors(chain = true)
@Table(name = "battles")
public class Battle {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "battle_seq")
//    @GenericGenerator(
//            name = "battle_seq",
//            strategy = "hello.model.geneators.StringPrefixedSequenceIdGenerator",
//            parameters = {
//                    @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "30"),
//                    @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B"),
//                    @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d")})
    @Column(name = "btl_id")
    protected String id;

    @Column(name = "btl_name")
    @NonNull
    protected String name;

    @Temporal(TemporalType.TIMESTAMP)
//    @NonNull
    @Column(name = "btl_date")
    protected Date date;

    @Column(name = "btl_Exp")
//    @NonNull
    protected Integer exp;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "btl_id", nullable = true)
    private Record record;
}

package hello.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BattleRequest {
    //    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String id;

    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String name;

    private Date date;
    private Integer exp;
}
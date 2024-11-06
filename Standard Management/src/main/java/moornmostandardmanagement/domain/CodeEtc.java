package moornmostandardmanagement.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeEtc {

    private String ItemCode;

    private String Etc;

    private String Etc1;

    private String Etc2;

    private String Etc3;

    private String Etc4;

    private String Etc5;
}
//>>> DDD / Value Object

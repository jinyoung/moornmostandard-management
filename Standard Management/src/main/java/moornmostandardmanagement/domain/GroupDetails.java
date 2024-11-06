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
public class GroupDetails {

    private String AuthCode;

    private String AuthName;

    private String AuthSer;

    private String Memo;
}
//>>> DDD / Value Object

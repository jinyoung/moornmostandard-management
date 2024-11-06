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
public class AuthorityDetails {

    private String MenuCode;

    private String AuthType;

    private String AuthCode;

    private String AuthMode;
}
//>>> DDD / Value Object

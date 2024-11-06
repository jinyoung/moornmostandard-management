package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthUserCreated extends AbstractEvent {

    private Long auNo;
    private String authCode;
    private String workerNo;
    private String regiNm;
    private Date regiDt;
    private String modiNm;
    private Date modiDt;
    private UserDetails userDetails;

    public AuthUserCreated(AuthUser aggregate) {
        super(aggregate);
    }

    public AuthUserCreated() {
        super();
    }
}
//>>> DDD / Domain Event

package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthGrpCreated extends AbstractEvent {

    private Long agNo;
    private String authCode;
    private String authName;
    private String authSer;
    private String memo;
    private String regiNm;
    private Date regiDt;
    private String modiNm;
    private Date modiDt;
    private GroupDetails groupDetails;

    public AuthGrpCreated(AuthGrp aggregate) {
        super(aggregate);
    }

    public AuthGrpCreated() {
        super();
    }
}
//>>> DDD / Domain Event

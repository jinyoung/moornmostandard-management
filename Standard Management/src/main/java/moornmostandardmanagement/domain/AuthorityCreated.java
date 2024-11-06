package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorityCreated extends AbstractEvent {

    private Long auNo;
    private String menuCode;
    private String authType;
    private String authCode;
    private String authMode;
    private String regiNm;
    private Date regiDt;
    private String modiNm;
    private Date modiDt;
    private AuthorityDetails authorityDetails;

    public AuthorityCreated(Authority aggregate) {
        super(aggregate);
    }

    public AuthorityCreated() {
        super();
    }
}
//>>> DDD / Domain Event

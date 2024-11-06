package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthGrpDeleted extends AbstractEvent {

    private Long agNo;

    public AuthGrpDeleted(AuthGrp aggregate) {
        super(aggregate);
    }

    public AuthGrpDeleted() {
        super();
    }
}
//>>> DDD / Domain Event

package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthUserDeleted extends AbstractEvent {

    private Long auNo;

    public AuthUserDeleted(AuthUser aggregate) {
        super(aggregate);
    }

    public AuthUserDeleted() {
        super();
    }
}
//>>> DDD / Domain Event

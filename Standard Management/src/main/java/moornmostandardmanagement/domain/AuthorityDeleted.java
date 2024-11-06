package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorityDeleted extends AbstractEvent {

    private Long auNo;

    public AuthorityDeleted(Authority aggregate) {
        super(aggregate);
    }

    public AuthorityDeleted() {
        super();
    }
}
//>>> DDD / Domain Event

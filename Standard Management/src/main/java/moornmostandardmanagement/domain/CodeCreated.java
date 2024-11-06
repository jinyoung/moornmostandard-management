package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmostandardmanagement.domain.*;
import moornmostandardmanagement.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CodeCreated extends AbstractEvent {

    private String itemCode;
    private String codeNo;
    private String code;
    private String codeName;
    private String isSys;
    private String isUse;
    private CodeEtc codeEtc;

    public CodeCreated(Code aggregate) {
        super(aggregate);
    }

    public CodeCreated() {
        super();
    }
}
//>>> DDD / Domain Event

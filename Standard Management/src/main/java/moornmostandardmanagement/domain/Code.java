package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moornmostandardmanagement.StandardManagementApplication;
import moornmostandardmanagement.domain.CodeCreated;

@Entity
@Table(name = "Code_table")
@Data
//<<< DDD / Aggregate Root
public class Code {

    @Id
    private String itemCode;

    private String codeNo;

    private String code;

    private String codeName;

    private String isSys;

    private String isUse;

    @Embedded
    private CodeEtc codeEtc;

    @PostPersist
    public void onPostPersist() {
        CodeCreated codeCreated = new CodeCreated(this);
        codeCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CodeRepository repository() {
        CodeRepository codeRepository = StandardManagementApplication.applicationContext.getBean(
            CodeRepository.class
        );
        return codeRepository;
    }
}
//>>> DDD / Aggregate Root

package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moornmostandardmanagement.StandardManagementApplication;
import moornmostandardmanagement.domain.AuthGrpCreated;
import moornmostandardmanagement.domain.AuthGrpDeleted;

@Entity
@Table(name = "AuthGrp_table")
@Data
//<<< DDD / Aggregate Root
public class AuthGrp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agNo;

    private String authCode;

    private String authName;

    private String authSer;

    private String memo;

    private String regiNm;

    private Date regiDt;

    private String modiNm;

    private Date modiDt;

    @Embedded
    private GroupDetails groupDetails;

    @PostPersist
    public void onPostPersist() {
        AuthGrpCreated authGrpCreated = new AuthGrpCreated(this);
        authGrpCreated.publishAfterCommit();

        AuthGrpDeleted authGrpDeleted = new AuthGrpDeleted(this);
        authGrpDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AuthGrpRepository repository() {
        AuthGrpRepository authGrpRepository = StandardManagementApplication.applicationContext.getBean(
            AuthGrpRepository.class
        );
        return authGrpRepository;
    }
}
//>>> DDD / Aggregate Root

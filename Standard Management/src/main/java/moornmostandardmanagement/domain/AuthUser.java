package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moornmostandardmanagement.StandardManagementApplication;
import moornmostandardmanagement.domain.AuthUserCreated;
import moornmostandardmanagement.domain.AuthUserDeleted;

@Entity
@Table(name = "AuthUser_table")
@Data
//<<< DDD / Aggregate Root
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long auNo;

    private String authCode;

    private String workerNo;

    private String regiNm;

    private Date regiDt;

    private String modiNm;

    private Date modiDt;

    @Embedded
    private UserDetails userDetails;

    @PostPersist
    public void onPostPersist() {
        AuthUserCreated authUserCreated = new AuthUserCreated(this);
        authUserCreated.publishAfterCommit();

        AuthUserDeleted authUserDeleted = new AuthUserDeleted(this);
        authUserDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AuthUserRepository repository() {
        AuthUserRepository authUserRepository = StandardManagementApplication.applicationContext.getBean(
            AuthUserRepository.class
        );
        return authUserRepository;
    }
}
//>>> DDD / Aggregate Root

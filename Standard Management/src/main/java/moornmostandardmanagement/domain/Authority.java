package moornmostandardmanagement.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moornmostandardmanagement.StandardManagementApplication;
import moornmostandardmanagement.domain.AuthorityCreated;
import moornmostandardmanagement.domain.AuthorityDeleted;

@Entity
@Table(name = "Authority_table")
@Data
//<<< DDD / Aggregate Root
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long auNo;

    private String menuCode;

    private String authType;

    private String authCode;

    private String authMode;

    private String regiNm;

    private Date regiDt;

    private String modiNm;

    private Date modiDt;

    @Embedded
    private AuthorityDetails authorityDetails;

    @PostPersist
    public void onPostPersist() {
        AuthorityCreated authorityCreated = new AuthorityCreated(this);
        authorityCreated.publishAfterCommit();

        AuthorityDeleted authorityDeleted = new AuthorityDeleted(this);
        authorityDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AuthorityRepository repository() {
        AuthorityRepository authorityRepository = StandardManagementApplication.applicationContext.getBean(
            AuthorityRepository.class
        );
        return authorityRepository;
    }
}
//>>> DDD / Aggregate Root

package moornmostandardmanagement.domain;

import moornmostandardmanagement.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "authGrps", path = "authGrps")
public interface AuthGrpRepository
    extends PagingAndSortingRepository<AuthGrp, Long> {}

package moornmostandardmanagement.domain;

import moornmostandardmanagement.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "authUsers", path = "authUsers")
public interface AuthUserRepository
    extends PagingAndSortingRepository<AuthUser, Long> {}

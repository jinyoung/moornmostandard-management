package moornmostandardmanagement.infra;

import moornmostandardmanagement.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AuthUserHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AuthUser>> {

    @Override
    public EntityModel<AuthUser> process(EntityModel<AuthUser> model) {
        return model;
    }
}

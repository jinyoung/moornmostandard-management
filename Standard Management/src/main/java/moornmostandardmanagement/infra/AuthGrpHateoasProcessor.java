package moornmostandardmanagement.infra;

import moornmostandardmanagement.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AuthGrpHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AuthGrp>> {

    @Override
    public EntityModel<AuthGrp> process(EntityModel<AuthGrp> model) {
        return model;
    }
}

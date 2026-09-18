package se.fk.github.regeltemplate.presentation;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;
import se.fk.rimfrost.framework.regel.komplettering.presentation.rest.RegelKompletteringController;
import se.fk.rimfrost.template.regel.komplettering.openapi.jaxrsspec.controllers.generatedsource.model.TemplateKompletteringData; // TODO byt ut mot regelns API

/**
 * Template för kompletteringsregler.
 * Byt ut {@code TemplateKompletteringData} mot klassen genererad från regelns OpenAPI-spec
 * och döp om {@code @Path} till regelns endpoint.
 */
@Path("/regel/regel-template-komplettering") // TODO to be renamed
@ApplicationScoped
public class RegelTemplateController extends RegelKompletteringController<TemplateKompletteringData> // TODO byt ut RegelTemplateController till klass genererad från regelns OpenAPI-spec
{

}

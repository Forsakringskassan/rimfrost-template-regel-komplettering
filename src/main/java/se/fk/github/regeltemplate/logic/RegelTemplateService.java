package se.fk.github.regeltemplate.logic;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.handlaggning.model.Handlaggning;
import se.fk.rimfrost.framework.handlaggning.model.HandlaggningUpdate;
import se.fk.rimfrost.framework.handlaggning.model.ImmutableHandlaggningUpdate;
import se.fk.rimfrost.framework.handlaggning.model.ImmutableYrkande;
import se.fk.rimfrost.framework.regel.komplettering.logic.RegelKompletteringService;
import se.fk.rimfrost.template.regel.komplettering.openapi.jaxrsspec.controllers.generatedsource.model.TemplateKompletteringData; // TODO byt ut mot regelns API

/**
 * Implementering av {@link RegelKompletteringService}.
 * Byt ut {@code TemplateKompletteringData} mot klassen genererad från regelns OpenAPI-spec.
 * Implementera varje metod med regelns affärslogik.
 */
@ApplicationScoped
public class RegelTemplateService implements RegelKompletteringService<TemplateKompletteringData>
{

   /**
    * TODO: Implementera — returnera {@code true} om yrkandet saknar data som handläggaren måste komplettera.
    */
   @Override
   public boolean isKompletteringRequired(Handlaggning handlaggning)
   {
      // TODO to be implemented: regelns logik för att avgöra om komplettering krävs
      return false;
   }

   /**
    * TODO: Implementera — extrahera relevant data från handläggningen och populera svarsobjektet.
    */
   @Override
   public TemplateKompletteringData readSvarData(Handlaggning handlaggning) // TODO byt ut TemplateKompletteringData mot klass genererad från regelns OpenAPI-spec
   {
      // TODO to be implemented: regelns logik för att skapa kompletteringsdata
      var data = new TemplateKompletteringData(); // TODO: populera från handläggningen
      return data;
   }

   /**
    * TODO: Implementera — applicera handläggarens svar för att uppdatera handläggningen.
    */
   @Override
   public HandlaggningUpdate registerSvar(Handlaggning handlaggning, TemplateKompletteringData request) // TODO byt ut TemplateKompletteringData mot klass genererad från regelns OpenAPI-spec
   {
      return null; // TODO to be implemented: uppdatera data från TemplateKompletteringData request
   }

}

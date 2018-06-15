package fr.octo.craft.SalleDeSport.Formule.Infrastructure.Database;

import fr.octo.craft.SalleDeSport.Formule.Domain.Formule;
import fr.octo.craft.SalleDeSport.Formule.Domain.FormuleId;
import fr.octo.craft.SalleDeSport.Formule.Domain.FormuleRepository;
import fr.octo.craft.SalleDeSport.Formule.Domain.FormuleRepositoryException;

import java.util.ArrayList;
import java.util.Collection;

public final class FormuleInMemoryRepository implements FormuleRepository {

    private final Collection<Formule> formules = new ArrayList<>();

    @Override
    public void store(Formule formule) {
        formules.add(formule);
    }

    @Override
    public Formule get(FormuleId formuleId) throws FormuleRepositoryException {
        for (Formule formule : formules) {
            if (formule.id().equals(formuleId)) {
                return formule;
            }
        }

        throw FormuleRepositoryException.introuvable(formuleId);
    }
}

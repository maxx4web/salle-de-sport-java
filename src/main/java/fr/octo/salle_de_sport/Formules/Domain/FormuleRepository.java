package fr.octo.salle_de_sport.Formules.Domain;

public interface FormuleRepository {

    void store(Formule formule);

    Formule get(FormuleId adhérentId) throws FormuleRepositoryException;
}

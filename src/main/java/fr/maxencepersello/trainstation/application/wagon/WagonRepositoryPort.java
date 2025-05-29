package fr.maxencepersello.trainstation.application.wagon;

import fr.maxencepersello.trainstation.domain.wagon.Wagon;
import java.util.List;

public interface WagonRepositoryPort {
    List<Wagon> findAll();
    Wagon save(Wagon wagon);
}

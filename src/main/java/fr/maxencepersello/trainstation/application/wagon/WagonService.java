package fr.maxencepersello.trainstation.application.wagon;

import fr.maxencepersello.trainstation.domain.wagon.Wagon;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WagonService {
    private final WagonRepositoryPort wagonRepositoryPort;

    public WagonService(WagonRepositoryPort wagonRepositoryPort) {
        this.wagonRepositoryPort = wagonRepositoryPort;
    }

    public List<Wagon> getAllWagons() {
        return wagonRepositoryPort.findAll();
    }
}

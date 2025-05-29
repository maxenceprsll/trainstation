package fr.maxencepersello.trainstation.infrastructure.wagon;

import fr.maxencepersello.trainstation.domain.wagon.Wagon;
import fr.maxencepersello.trainstation.application.wagon.WagonRepositoryPort;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WagonPersistenceAdapter implements WagonRepositoryPort {
    private final WagonRepository repository;

    public WagonPersistenceAdapter(WagonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Wagon> findAll() {
        return repository.findAll().stream()
                .map(WagonMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Wagon save(Wagon wagon) {
        WagonEntity entity = WagonMapper.toEntity(wagon);
        WagonEntity saved = repository.save(entity);
        return WagonMapper.toDomain(saved);
    }
}

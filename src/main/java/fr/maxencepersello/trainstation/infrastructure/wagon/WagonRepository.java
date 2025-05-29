package fr.maxencepersello.trainstation.infrastructure.wagon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WagonRepository extends JpaRepository<WagonEntity, Long> {
}

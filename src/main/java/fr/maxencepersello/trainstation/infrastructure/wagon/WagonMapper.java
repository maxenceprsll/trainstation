package fr.maxencepersello.trainstation.infrastructure.wagon;

import fr.maxencepersello.trainstation.domain.wagon.Wagon;

public class WagonMapper {
    public static Wagon toDomain(WagonEntity entity) {
        return new Wagon(
            entity.getId(),
            entity.getRessourceType(),
            entity.getBoost(),
            entity.getName(),
            entity.getCostToBuy(),
            entity.getMinimumLevelToBuy(),
            entity.getMaximumAmount()
        );
    }

    public static WagonEntity toEntity(Wagon wagon) {
        WagonEntity entity = new WagonEntity();
        entity.setId(wagon.getId());
        entity.setRessourceType(wagon.getRessourceType());
        entity.setBoost(wagon.getBoost());
        entity.setName(wagon.getName());
        entity.setCostToBuy(wagon.getCostToBuy());
        entity.setMinimumLevelToBuy(wagon.getMinimumLevelToBuy());
        entity.setMaximumAmount(wagon.getMaximumAmount());
        return entity;
    }
}

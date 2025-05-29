package fr.maxencepersello.trainstation.domain.wagon;

public class Wagon {
    private final Long id;
    private final RessourceType ressourceType;
    private final int boost;
    private final String name;
    private final int costToBuy;
    private final int minimumLevelToBuy;
    private final int maximumAmount;

    public Wagon(Long id, RessourceType ressourceType, int boost, String name, int costToBuy, int minimumLevelToBuy, int maximumAmount) {
        this.id = id;
        this.ressourceType = ressourceType;
        this.boost = boost;
        this.name = name;
        this.costToBuy = costToBuy;
        this.minimumLevelToBuy = minimumLevelToBuy;
        this.maximumAmount = maximumAmount;
    }

    public Long getId() { return id; }
    public RessourceType getRessourceType() { return ressourceType; }
    public int getBoost() { return boost; }
    public String getName() { return name; }
    public int getCostToBuy() { return costToBuy; }
    public int getMinimumLevelToBuy() { return minimumLevelToBuy; }
    public int getMaximumAmount() { return maximumAmount; }
}

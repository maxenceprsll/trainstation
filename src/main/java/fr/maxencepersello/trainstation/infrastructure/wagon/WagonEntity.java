package fr.maxencepersello.trainstation.infrastructure.wagon;

import fr.maxencepersello.trainstation.domain.wagon.RessourceType;
import jakarta.persistence.*;

@Entity
@Table(name = "wagon")
public class WagonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RessourceType ressourceType;

    private int boost;
    private String name;
    private int costToBuy;
    private int minimumLevelToBuy;
    private int maximumAmount;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public RessourceType getRessourceType() { return ressourceType; }
    public void setRessourceType(RessourceType ressourceType) { this.ressourceType = ressourceType; }
    public int getBoost() { return boost; }
    public void setBoost(int boost) { this.boost = boost; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCostToBuy() { return costToBuy; }
    public void setCostToBuy(int costToBuy) { this.costToBuy = costToBuy; }
    public int getMinimumLevelToBuy() { return minimumLevelToBuy; }
    public void setMinimumLevelToBuy(int minimumLevelToBuy) { this.minimumLevelToBuy = minimumLevelToBuy; }
    public int getMaximumAmount() { return maximumAmount; }
    public void setMaximumAmount(int maximumAmount) { this.maximumAmount = maximumAmount; }
}

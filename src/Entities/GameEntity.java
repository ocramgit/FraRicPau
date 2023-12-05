package Entities;

public class GameEntity {
    private String entityName;

    public GameEntity() {
    }

    public GameEntity(String entityName) {
        this.entityName = entityName;
    }

    //============ GAME ENTITY METHODS ============\\

    //============== GETTER & SETTER ============\\
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}

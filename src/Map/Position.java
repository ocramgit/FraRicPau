package Map;

public abstract class Position {
    private Building building;
    private NPC npc;
    private Grass grass;

    public Building getBuilding() {
        return this.building;
    }

    public NPC getNPC() {
        return this.npc;
    }

    public Grass getGrass() {
        return this.grass;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    public void setGrass(Grass grass) {
        this.grass = grass;
    }
}

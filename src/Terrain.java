public class Terrain {

    private int blocks;
    private int terrainLimit;

    public Terrain() {
    }

    public Terrain(int blocks, int terrainLimit) {
        this.blocks = blocks;
        this.terrainLimit = terrainLimit;
    }

    /**
     * @return the blocks
     */
    public int getBlocks() {
        return blocks;
    }

    /**
     * @param blocks the blocks to set
     */
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    /**
     * @return the terrainLimit
     */
    public int getTerrainLimit() {
        return terrainLimit;
    }

    /**
     * @param terrainLimit the terrainLimit to set
     */
    public void setTerrainLimit(int terrainLimit) {
        this.terrainLimit = terrainLimit;
    }

    @Override
    public String toString() {
        return "Terrain{" + "blocks=" + blocks + ", terrainLimit=" + terrainLimit + '}';
    }
    
}
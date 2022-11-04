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
    
    public static void mostrarCuadrantes(){
        int cuadrante[][]= new int[2][2];
        cuadrante[0][0]=2;
        cuadrante[0][1]=2;
        cuadrante[1][0]=2;
        cuadrante[1][1]=2;
        
        for (int i = 0; i < cuadrante.length; i++) {
            System.out.println("______________");
            for (int j = 0; j < cuadrante[i].length; j++) {
                System.out.print(cuadrante[i][j]+" | ");
            }
            System.out.println("");
        }
        System.out.println("______________");
        
    }
    
}
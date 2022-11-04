public class Explotions {

    private int explotionLimit;
    private int tonsAccumulator;

    public Explotions() {
    }

    public Explotions(int explotionLimit, int tonsAccumulator) {
        this.explotionLimit = explotionLimit;
        this.tonsAccumulator = tonsAccumulator;
    }

    /**
     * @return the explotionLimit
     */
    public int getExplotionLimit() {
        return explotionLimit;
    }

    /**
     * @param explotionLimit the explotionLimit to set
     */
    public void setExplotionLimit(int explotionLimit) {
        this.explotionLimit = explotionLimit;
    }

    /**
     * @return the tonsAccumulator
     */
    public int getTonsAccumulator() {
        return tonsAccumulator;
    }

    /**
     * @param tonsAccumulator the tonsAccumulator to set
     */
    public void setTonsAccumulator(int tonsAccumulator) {
        this.tonsAccumulator = tonsAccumulator;
    }

    @Override
    public String toString() {
        return "Explotions{" + "explotionLimit=" + explotionLimit + ", tonsAccumulator=" + tonsAccumulator + '}';
    }
     private static Product [] [] cuadrante= new Product[2][2];
    
    
    public static void cargarCuadrante(Product p1, Product p2, Product p3, Product p4){
        cuadrante[0][0]= p1;
        cuadrante[0][1]= p2;
        cuadrante[1][0]= p3;
        cuadrante[1][1]= p4;
    }
    
    
    public static void mostrarCuadrantes(){
        for (int i = 0; i < cuadrante.length; i++) {
            System.out.println("______________");
            for (int j = 0; j < cuadrante[i].length; j++) {
                System.out.print(cuadrante[i][j].toString()+" | ");
            }
            System.out.println("");
        }
        System.out.println("______________");
        
    }
    
    
    public static void extraerMaterial(Product aux){
        for (int i = 0; i < cuadrante.length; i++) {
            for (int j = 0; j < cuadrante[i].length; j++) {
                if(aux.getTipo() == cuadrante[i][j].getTipo()){
                    cuadrante[i][j].setCantidad(cuadrante[i][j].getCantidad()-
                            aux.getCantidad());
                    break;
                }
            }
            System.out.println("");
        }
    }

}
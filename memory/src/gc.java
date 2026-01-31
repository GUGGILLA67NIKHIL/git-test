public class gc {


    public void finalize(){
        System.out.println("excuteed ");
    }
    public static  void main (String[] args){
        gc G = new gc();
        gc G1 = new gc();
        gc G2 = new gc();
        new gc();
        G =null;
        G1=G2;
        System.gc();



    }
}

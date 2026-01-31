//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employ {
    int orgid = 124;
    String orgname = "hcl";
    String ceo = "nikhil";
    int nodep = 2;
      static double networth = 3456.78;

    public static void main(String[] args) throws InterruptedException {
        int id = 1;
        String name = "nik";
        double salary = 123.00;
        Employ e = new Employ();
       // Thread.sleep(10000);
       e.getOrgid();
        System.out.println(Employ.getNetworth());

        Employ e1 = new Employ();
       e1.deleteemploye(1);

    }

    public  void  deleteemploye(int id){
    }

    public  static double getNetworth() {
        return networth;
    }



    public int getOrgid() {
        return orgid;
    }


}
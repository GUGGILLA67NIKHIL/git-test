//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hellow thread ");
        System.out.println(java.lang.Thread.currentThread().getName());//it gives thread name
        System.out.println(Thread.activeCount());//it give count of threads
        //to create a thread
//        Thread t1= new Thread();
//        Thread t2= new Thread();
//        Thread t3= new Thread();
//        Thread t4= new Thread();
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println(Thread.activeCount());
//        empl e = new empl();// we create obeject without giving name when we use implemenmts of class but when we use extends we dont create a thread obejct below line we just this line
//        Thread T1 = new Thread("nik");
//        T1.start();
// there is other way to used multi threrading is annoymous class
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("i am ann 1 "+Thread.currentThread().getName());
//            }
//        };
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("i am ann 2 "+Thread.currentThread().getName());
//            }
//        };
//        Thread t1 = new Thread(r1,"nik");
//        Thread t2 = new Thread(r2,"madhu");
//        t1.start();
//        t2.start();
// there is simplest way to use this lamda  bacause Runnable class is functional interface s we can use by lamda

        Runnable r1 = () -> {
            for(int i=0;i<10;i++) {
                //System.out.println("i am ann 1 " + Thread.currentThread().getName());
            }
        };
        Runnable r2 = () -> {
            for(int i=0;i<10;i++) {//i am using for loop to test is multithreading working or not if out put is print one after one them it is not working but they run at ssame time then it working
            //System.out.println("i am ann 2 "+Thread.currentThread().getName());
        }};

       Thread t1 = new Thread(r1,"nik");
       Thread t2 = new Thread(r2,"madhu");
        System.out.println(t1.getState()); // this is used to know life ccyle of thread . this line help to find which status it is in
       t1.start();
        System.out.println(t1.getState());
       t1.join();// this is used to say the system to run t1 first after completing that   then join with other threads
        System.out.println(t1.getState());
        t1.sleep(10000);// this is used for saying system to wait 10 sec after completing the t1
        System.out.println(t1.getState());
      t2.start();
    }


}
//class empl implements Runnable{
//
////this below mwthod is used ton change name when we use extending other class. in that we create a constrctor and then pass name aruguments ;
////    public  empl(String name ){
////        super(name);
////    }
//    @Override
//    public void run() {
//        System.out.println("hello i am runnning "+ Thread.currentThread().getName());
//    }
//}
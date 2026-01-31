public class Student  implements  Comparable<Student>{
    int n;
    String name;
    int marks;
    int science;
    int social;
    int maths;

    public Student(int i, String name, int marks,int maths,int social,int science ) {
        this.n=i;
        this.name=name;
        this.marks=marks;
        this.social=social;
        this.science=science;
        this.maths=maths;
    }
 @Override
    public String toString(){
     return  n+ " "+name+ " "+marks+ " "+maths+ " "+science+ " "+social;
 }

    @Override
    public int compareTo(Student anotherStudent) {
       return Integer.compare( this.n,anotherStudent.n);
       //return anotherStudent.name.compareTo( this.name);
    }
}

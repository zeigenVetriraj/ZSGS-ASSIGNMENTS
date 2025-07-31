

//3. Develop a Java program which illustrates the usage of Comparable Interface.

// Comparable is in lang package
public class ComparableInterface{

    public static void main(String[] args) {
        Student anand = new Student("Anand", 21, 450);
        Student parthibun = new Student("Parthibun", 18, 388);
        Student visua = new Student("Visuva", 21, 427);

        System.out.println(comparingStudents(anand,parthibun));
        System.out.println(comparingStudents(parthibun,visua));
        System.out.println(comparingStudents(visua,anand));
    }

    public static String comparingStudents(Student s1, Student s2){
        int res = s1.compareTo(s2); // this is ware the diference is form comparator interface and comparable interface
        if(res==1)return "The Age of "+s1.name+" is grater than "+s2.name;
        else if(res==0)return "The Age of "+s1.name+" and "+s2.name+" are equal.";
        else return "The Age of "+s1.name+" is less than "+s2.name;
    }
}
class Student implements Comparable<Student>{
    String name;
    int age;
    int total;

    public Student(String name, int age, int total){
        this.name = name;
        this.age = age;
        this.total = total;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age>that.age)return 1;
        else if(this.age==that.age)return 0;
        else return -1;
    }
}

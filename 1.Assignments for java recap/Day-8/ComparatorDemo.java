import java.util.Comparator;

//2. Develop a Java program which illustrates the usage of Comparator Interface.

public class ComparatorDemo{

    public static void main(String[] args) {
        Student anand = new Student("Anand", 21, 450);
        Student parthibun = new Student("Parthibun", 18, 388);
        Student visua = new Student("Visuva", 21, 427);

        System.out.println(comparingStudents(anand,parthibun));
        System.out.println(comparingStudents(parthibun,visua));
        System.out.println(comparingStudents(visua,anand));
    }

    public static String comparingStudents(Student s1, Student s2){
        AgeComparator com = new AgeComparator();
        int res = com.compare(s1, s2);
        if(res==1)return "The Age of "+s1.name+" is grater than "+s2.name;
        else if(res==0)return "The Age of "+s1.name+" and "+s2.name+" are equal.";
        else return "The Age of "+s1.name+" is less than "+s2.name;
    }
}
class Student{
    String name;
    int age;
    int total;

    public Student(String name, int age, int total){
        this.name = name;
        this.age = age;
        this.total = total;
    }

}

class AgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2){
        if(s1.age>s2.age)return 1;
        else if(s1.age==s2.age)return 0;
        else return -1;
    }
}

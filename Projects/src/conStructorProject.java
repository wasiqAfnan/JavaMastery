class Student{
    String name;
    int age;
    double grade;

    // constructor
    Student(){
        name = "unknown";
        age = 0;
        grade = 0.0;
    }

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Methods
    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    void isPassed(){
        if (grade >= 50) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
public class conStructorProject {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("Wasiq",25, 50.00);
        Student std3 = new Student("Areeb",15, 59.00);
        std1.printDetails();
        std1.isPassed();
        
        std2.printDetails();
        std2.isPassed();
    }
}

package ref;

import static ref.Method1.initStudent;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = CreateStudent("학생1", 20, 90);
        Student student2 = CreateStudent("학생2", 20, 80);

        PrintStudent(student1);
        PrintStudent(student2);
    }

    static Student CreateStudent (String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void PrintStudent (Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적 : " + student.grade);
    }
}

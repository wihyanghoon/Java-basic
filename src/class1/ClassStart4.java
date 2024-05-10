package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "hyanghoon";
        student1.age = 30;
        student1.grade = 2;

        Student student2 = new Student();
        student2.name = "choi";
        student2.age = 64;
        student2.grade = 2;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age);
        }
    }
}

package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "hyanghoon";
        student1.age = 30;
        student1.grade = 2;

        Student student2 = new Student();
        student2.name = "choi";
        student2.age = 64;
        student2.grade = 2;

        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "성적 : " + student1.grade);
        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "성적 : " + student1.grade);
    }
}

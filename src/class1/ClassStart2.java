package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNamse = {"학생 1", "학생 2", "학생 3", "학생 4"};
        int[] studentAges = {1, 2, 3, 4};

        for (int i = 0; i < studentNamse.length; i++) {
            System.out.println("이름 : " + studentNamse[i] + " 나이 : " + studentAges[i]);
        }
    }
}

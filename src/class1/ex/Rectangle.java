package class1.ex;

public class Rectangle {
    int width;
    int height;

    void calculateArea () {
        System.out.println("넓이 : " + (width * height));
    }

    void calculatePerimeter () {
        System.out.println("둘레길이 : " + 2 * (width + height));
    }

    void isSquare() {
        if(width == height){
            System.out.println("정사각형 입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
}

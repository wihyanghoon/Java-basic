## Java-basic

### oop-basic-syntax

* class & date
  * The class name is conventionally in using <code>camel case</code>.
  * Variables within a class are usually called member <code>variables</code> or <code>fields</code>.
  * <code>User-Defined Types</code> represents the form of a corresponding value, such as an int modeled after the form of a class and a string.
  * What is made of class is called an <code>object</code> or <code>instance</code>
  <br />
  ```java
  // 관례적으로 카멜표기법을 사용, 첫문자는 대문자로 한다.
  // 클래스는 설계도라 생각한다.
  class Student {
    // 멤버 변수 or 필드
    String name = "wi-hyang-hoon";
    int age = 30;
  }
  
  class Main {
    public static void main(String[] args){
      // 사용자정의 타입으로 생성
      // student1의 값은 주소값을 가지는 참조형이다.
      Student student1 = new Student();
    }
  }
  ```
* primitive type & reference type
* oop
* constructor
* package
* access modifier
* java memory struct & static
* final & const
* inheritance
* polymorphism
  * overloading
  * override
* solid
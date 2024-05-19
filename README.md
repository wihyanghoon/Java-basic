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
    * 자바의 대원칙 "변수에 할당한 어떠한 값은 다른 값에 넣을 때 그 값을 복사하여 할당함."
    * "참조형"은 "주소값을 가지고 있음"
    * c언어를 학습했다면 포인터의 개념과 유사하다.
* oop
    * 객체 지향을 알기 전에 "절차 지향 프로그래밍"에 대해 알아한다.
    * 절차 지향은 프로그램의 흐름을 순차적으로 따르며 처리하는 방식이다.
    <hr>

    * 객체 지향 프로그래밍은 객체를 지향한다.
    * 사물이나 사건을 객체로 보고, 이런한 객체들간의 상호작용을 중심으로 프로그래밍 하는 방식
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
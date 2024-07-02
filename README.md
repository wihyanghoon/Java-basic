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
      * 프로그래밍이 방대하지고 복잡해지더라도 같은 형태들을 클래스로 묶어둔다면 관리가 용이하다.
      * 절차지향의 한계점은 데이터와 기능이 분리되어 있다는 것이다.
    * constructor
        * 생성자로써, 클래스 이름과 동일하게 사용하는 메서드로 초기값을 설정하기 위해 사용된다.
        * 생성자도 오버로딩 형태로 다형성으로 구성 할 수 있음,
        ```java
      class User {
          String name;
          int age;
        
          // 중복 된 코드가 발생한다.
          User(String name){
              this.name = name;
              this.age = 20;
          }
        
          User(String name, int age) {
              this.name = name;
              this.age = age;
          }
      }
        ```

        ```java
        class User {
            String name;
            int age;
          
            // 중복 된 코드가 발생을 최소화 하기위해 자기 자신의 생성자를 호출
            User(String name){
                // 생성자 메서드 body안에 자기 자신을 this로 호출 할 경우 첫째 라인에서 만 사용 가능하다.
                this(name, 20);
            }
          
            User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
       ```
* package
   * 패키지 생성시 이름의 관례적인 것들이 있다.
   * 소문자로 만들것
   * 회사 이름을 포함해서 실제로 많이 작성한다.
   * 패키지 이름이 중복될 경우 자주 사용하는 것을 import 해서 사용
    ```java
    package pack;

    import pack.a.User;
  
    public class PackageMain3 {
        public static void main(String[] args) {
           // 같은 이름의 클래스를 사용 할 경우 자주 사용하는것을 import 시켜 사용함.
           User userA = new User();
           pack.b.User userB = new pack.b.User();
        }
    }
    ```
* access modifier
* java memory struct & static
* final & const
* inheritance
* polymorphism
  * overloading
  * override
* solid
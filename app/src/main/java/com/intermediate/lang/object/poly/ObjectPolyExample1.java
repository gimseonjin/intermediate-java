package com.intermediate.lang.object.poly;

public class ObjectPolyExample1 {


  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();

    action(dog);
    action(car);
  }

  // Object 클래스는 모든 객체의 부모이기 때문에 다 참조 가능하다.
  // 그러나 Object 클래스는 모든 객체의 메소드를 사용할 수 없다.
  // 왜냐하면 메소트 스캔은 자식 클래스에서 부모 클래스 순으로 이루어지기 때문이다.
  // 부모 클래스에서 자식 클래스로 접근할 수 없다.
  // 따라서 Object 클래스에서 자식 클래스의 메소드를 사용하려면 다운 캐스팅을 해야 한다.
  private static void action(Object obj){
    if (obj instanceof Dog dog)
      dog.sound();
    else if (obj instanceof Car car)
      car.move();
  }
}

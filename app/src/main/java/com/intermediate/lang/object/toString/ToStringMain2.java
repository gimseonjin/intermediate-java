package com.intermediate.lang.object.toString;

public class ToStringMain2 {

  public static void main(String[] args) {
    Dog dog1 = new Dog("Bobby", 3);
    Dog dog2 = new Dog("Bobby", 5);
    Car car = new Car("BMW");

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(car);

    // 자식에 재정의된 메소드가 있는지 찾아본다.
    ObjectPrinter.print(dog1);
    ObjectPrinter.print(dog2);
    ObjectPrinter.print(car);
  }
}

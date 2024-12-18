package com.intermediate.lang.object.poly;

public class ObjectPolyExample2 {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();
    Object obj = dog;

    Object[] objects = {dog, car, obj};

    size(objects);
  }

  private static void size(Object[] objects){
    System.out.println("objects size: " + objects.length);
  }
}

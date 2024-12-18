package com.intermediate.lang.object;

public class ObjectMain {

  public static void main(String[] args) {
    Child child = new Child();
    child.childMethod();
    child.parentMethod();

    // toString() 메소드는 Object 클래스의 메소드이다.
    String string = child.toString(); // toString() 메소드는 객체의 정보를 문자열로 반환한다.
    System.out.println(string);
  }

}

// Object는 모든 객체의 부모클래스다
// 따라서 Object는 모든 객체를 참조할 수 있다.

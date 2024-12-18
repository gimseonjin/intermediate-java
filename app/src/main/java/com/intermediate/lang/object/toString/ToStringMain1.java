package com.intermediate.lang.object.toString;

public class ToStringMain1 {


  public static void main(String[] args) {
    Object object = new Object();
    String objectString = object.toString();

    // toString() 메소드는 Object 클래스의 메소드이다.
    // toString() 메소드는 객체의 정보를 문자열로 반환한다.
    // println(object)는 println(object.toString())와 같다.
    // 왜냐하면 println() 메소드는 객체를 출력할 때 내부에서 String.valueOf() 메소드를 호출하는데,
    // String.valueOf() 메소드는 객체의 toString() 메소드를 호출한다.
    System.out.println(objectString);
    System.out.println(object);
  }

}

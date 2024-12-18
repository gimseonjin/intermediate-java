package com.intermediate.lang.object;

// 부모가 있기 때문에 Object 클래스를 상속받지 않는다.
// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Child extends Parent {

  public void childMethod() {
    System.out.println("Child Method");
  }
}

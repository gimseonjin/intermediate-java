package com.intermediate.lang.object.equals;

public class EqualsMain {

  public static void main(String[] args) {
    User user = new User("id-100");
    User user2 = new User("id-100");

    System.out.println("identity = " + (user == user2));
    System.out.println("equals = " + user.equals(user2));
  }

}

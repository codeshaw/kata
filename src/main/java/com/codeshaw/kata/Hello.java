package com.codeshaw.kata;

/**
 * Hello, world!
 */
public class Hello {

  /**
   * Says hello to the person in the parameter.
   * @param sayHelloTo The person to say hello to
   * @return A greeting
   */
  public String sayHello(String sayHelloTo) {
    return String.format("Hello, %s", sayHelloTo);
  }
}

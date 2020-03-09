package com.codeshaw.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HelloTest {

  private Hello hello;

  @BeforeEach
  void setUp() {
    this.hello = new Hello();
  }

  @ParameterizedTest
  @CsvSource(value = {
      "Tom:Hello, Tom",
      "Dick:Hello, Dick",
      "Harry:Hello, Harry" }, delimiter = ':')
  public void testSayHello(String input, String expected) {
    assertThat(hello.sayHello(input), is(expected));
  }
}

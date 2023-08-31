package org.hemanth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloLambdaTest {

    @Test
    void handleRequest() {
        var sut = new HelloLambda();
        Assertions.assertEquals("Hello, AWS Lambda!",sut.handleRequest());
    }
}
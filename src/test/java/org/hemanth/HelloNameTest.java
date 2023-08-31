package org.hemanth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloNameTest {


    @Test
    void  handleRequest(){
        var sut = new HelloName();
        Assertions.assertEquals("Hello Hemanth!",sut.handleRequest("Hemanth"));
    }
}

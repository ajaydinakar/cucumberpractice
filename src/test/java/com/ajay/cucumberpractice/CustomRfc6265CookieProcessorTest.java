package com.ajay.cucumberpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomRfc6265CookieProcessorTest {

    @Test
    void getCharset() {
    }

    @Test
    void parseCookieHeader() {
    }

    @Test
    void generateHeader() {
    }

    @Test
    void testValiddomain() {
        CustomRfc6265CookieProcessor ck=new CustomRfc6265CookieProcessor();
        ck.validateDomain(".ceo.wellsfargo.com");
    }
}
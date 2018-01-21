package com.kdev.pattern.j2ee.intercepting;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}

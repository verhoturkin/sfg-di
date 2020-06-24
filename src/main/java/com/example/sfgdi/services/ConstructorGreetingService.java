package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 16:38
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

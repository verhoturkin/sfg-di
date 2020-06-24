package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 17:02
 */
@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

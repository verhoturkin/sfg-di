package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 17:15
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

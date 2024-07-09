package com.example.spring.configuraionproperty;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanCheck {

    private final ConfigProperty configProperty;

    @PostConstruct
    public void init() {
        System.out.println(configProperty.getSchool().getName());
        System.out.println(configProperty.getSchool().getCourse());
    }
}

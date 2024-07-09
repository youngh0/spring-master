package com.example.spring.value;

import jakarta.annotation.PostConstruct;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ValueTest {

    @Value("${test.value}")
    private static Duration time;

    @PostConstruct
    public void init() {
        System.out.println(time);
    }
}

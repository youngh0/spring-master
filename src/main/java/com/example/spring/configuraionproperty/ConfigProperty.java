package com.example.spring.configuraionproperty;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("my")
@NoArgsConstructor
@Getter
public class ConfigProperty {

    private String name;
    private Integer age;
    private School school;

    @ConstructorBinding
    public ConfigProperty(String name, Integer age, @DefaultValue School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @PostConstruct
    public void init() {
        System.out.println("school name: " + school.name);
        System.out.println("school course: " + school.course);
    }

    @Getter
    static class School {
        private String name;
        private String course;

        public School(String name, String course) {
            this.name = name;
            this.course = course;
        }

        @PostConstruct
        public void init() {
            System.out.println("school name: " + name);
            System.out.println("school course: " + course);
        }
    }
}

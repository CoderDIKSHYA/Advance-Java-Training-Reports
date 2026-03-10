package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.capg.springboot.controller.c;

@Service
public class CapgTopicsService {

    private List<CapgTopics> topics = new ArrayList<>(Arrays.asList(
            new CapgTopics("Spring Boot", "Spring MVC", "SPRING"),
            new CapgTopics("J2SE Technologies", "JDBC", "JAVA"),
            new CapgTopics("UI Technologies", "Angular 6", "Angular")
    ));

    public List<CapgTopics> getAllMyTopics() {
        return topics;
    }

    public void addTopic(CapgTopics topic) {
        topics.add(topic);
    }
}
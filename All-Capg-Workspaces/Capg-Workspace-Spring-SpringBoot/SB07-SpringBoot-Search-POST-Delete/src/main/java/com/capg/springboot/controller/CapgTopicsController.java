package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.capg.springboot.model.CapgTopics;
//import com.capg.springboot.service.CapgTopicsService;

@RestController
public class CapgTopicsController {

    @Autowired
    private CapgTopicsService topicService;

    @GetMapping("/capgtopics")
    public List<CapgTopics> getAllTopics() {
        return topicService.getAllMyTopics();
    }

    @GetMapping("/capgtopics/{id}")
    public CapgTopics getTopic(@PathVariable("id") String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/capgtopics")
    public void addTopic(@RequestBody CapgTopics topic) {
        topicService.addTopic(topic);
    }

    @DeleteMapping("/capgtopics/{id}")
    public void deleteTopic(@PathVariable("id") String id) {
        topicService.deleteTopic(id);
    }
}
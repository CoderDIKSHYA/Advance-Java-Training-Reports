package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JavaTopicsService {
	public List topics=Arrays.asList(new JavaTopics("Lovely Professional university", "Btech CSE", "Final Year"),
									 new JavaTopics("Dikshya", "runuwal", "Student"));
	
	public List<JavaTopics> getAllMyTopics(){
		return topics;
	}
						
}
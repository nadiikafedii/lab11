package ua.edu.ucu.apps.task1;

import java.util.List;
import lombok.*;

@ToString
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;

    @Singular private List<String> courses;
    
}

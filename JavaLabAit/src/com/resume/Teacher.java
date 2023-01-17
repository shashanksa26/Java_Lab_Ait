package com.resume;

public class Teacher implements Resume {
String name,qualification,achievements;
float experience;
public void biodata()
{
name="Shaima Farhath";
qualification="B.Tech";
achievements="Q1publication";
experience=14.8f;
System.out.println("Teacher Resume");
System.out.println("Name : " +name);
System.out.println("Qualification : "+qualification);
System.out.println("Achievements : "+achievements);
System.out.println("Experience : "+experience);
}
}

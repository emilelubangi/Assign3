package za.ac.cput.project;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Student1Test {

    String reg ="Registered";
    String attendance = "Present";

    Students myStudent1 = new Student1();

    @Test
    public void enroll() {
        String regStatus = myStudent1.enroll();
        Assert.assertEquals(reg, regStatus);
    }

    @Test
    public void attend() {
        String regStatus = myStudent1.attend();
        Assert.assertEquals(regStatus, attendance);
    }
}
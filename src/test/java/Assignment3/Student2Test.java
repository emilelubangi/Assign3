package Assignment3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Student2Test {

    String reg ="Cancelled Registration";
    String attendance = "Absent";

    Students myStudent2 = new Student2();

    @Test
    public void enroll() {
        String regStatus = myStudent2.enroll();
        Assert.assertEquals(reg, regStatus);
    }

    @Test
    public void attend() {
        String attendStatus = myStudent2.attend();
        Assert.assertEquals(attendance,attendStatus);
    }
}
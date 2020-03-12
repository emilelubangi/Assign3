package za.ac.cput.project;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudTest {
    Stud myStud = new Stud();

    String name = myStud.name;
    String stud = myStud.studentNo;
    String sub = myStud.subject();
    String surname = myStud.surname();

    String pass = myStud.passed();
    String per = myStud.percent();





    @Test
    public void surname() {
        Assert.assertEquals("Sello",surname);
    }

    @Test
    public void subject() {
        Assert.assertEquals("ADP",sub);
    }

    @Test
    public void name(){
        Assert.assertEquals("Theo", name);
    }

    @Test
    public void pass(){
        Assert.assertEquals("Pass", pass);
    }

    @Test
    public void percent(){
        Assert.assertEquals("85%", per);
    }
}
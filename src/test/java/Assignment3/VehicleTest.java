package za.ac.cput.project;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void wheels() {

        Vehicle myVeh = new Vehicle();
        String msg = myVeh.wheels();

        Vehicle myTri = new Tricycle();
        String msg1 = myTri.wheels();

        Assert.assertEquals("This vehicle has 4 wheels",msg);
        Assert.assertEquals("This vehicle has 3 wheels",msg1);

    }
}
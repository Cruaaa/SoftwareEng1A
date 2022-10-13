package CT417partA;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;
import org.junit.Assert.*;

public class testLecturer {

    private Lecturer lecturer;

    public testLecturer()
    {
        lecturer= new Lecturer("Mr.Heisenberg",28,"19/02/1994",197642);
    }

    @Test
    public void testGetName() {

        Assert.assertEquals("Mr.Heisenberg", lecturer.getName());
    }

    @Test
    public void testGetAge()
    {
        Assert.assertEquals(28, lecturer.getAge());
    }


    @Test
    public void testGetDOB()
    {
        Assert.assertEquals("19/02/1994", lecturer.getDOB());
    }


    @Test
    public void testGetId()
    {
        long randNum=197642;
        Assert.assertEquals(randNum, lecturer.getID());
    }

    @Test
    public void testGetUsername()
    {
        String username= lecturer.getName()+String.valueOf(lecturer.getAge());
        Assert.assertEquals(username, lecturer.getUsername());
    }




}


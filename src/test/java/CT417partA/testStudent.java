package CT417partA;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;
import org.junit.Assert.*;
public class testStudent {

    private Student student;


    public testStudent()
    {
        student=new Student("Mark",19,"25/07/2003",19373226);
    }

    @Test
    public void testGetName()
    {
        Assert.assertEquals("Mark", student.getName());
    }

    @Test
    public void testGetAge()
    {
        Assert.assertEquals(19, student.getAge());
    }

    @Test
    public void testGetDOB()
    {
        Assert.assertEquals("25/07/2003", student.getDOB());
    }

    @Test
    public void testGetId()
    {
        long randNum= 19373226;
        Assert.assertEquals(randNum, student.getID());
    }

    @Test
    public void testGetUsername()
    {
        String username= student.getName()+String.valueOf(student.getAge());
        Assert.assertEquals(username, student.getUsername());
    }




    @Test
    public void testGetCourses()
    {
        ArrayList<Student> randomArrayList=null;
        Assert.assertTrue(student.getCourses() instanceof ArrayList);
    }

    @Test
    public void testGetModules()
    {
        ArrayList<Student> randomArrayList=null;
        Assert.assertTrue(student.getModules() instanceof ArrayList);
    }





}
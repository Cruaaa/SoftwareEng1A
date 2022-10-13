package CT417partA;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;
import org.junit.Assert.*;

public class testCourse_Programme {

    private Course_Programme testCourse ;

    public testCourse_Programme()
    {
        testCourse= new Course_Programme("Computer Science",new DateTime(2022,9,3,8,0),new DateTime(2026,4,30,11, 59),new ArrayList<Module>(),new ArrayList<Student>());
    }

    @Test
    public void testGetCourseName()
    {
        String courseName="Computer Science";
        Assert.assertEquals(courseName,testCourse.getCourseName());
    }

    @Test
    public void testGetStartDate()
    {
        DateTime start= new DateTime(2022,9,3,8,0);
        Assert.assertEquals(start,testCourse.getStartDate());
    }

    @Test
    public void testGetEndDate()
    {
        DateTime CourseEndDate= new DateTime(2026,4,30,11, 59);
        Assert.assertEquals(CourseEndDate,testCourse.getEndDate());
    }

    @Test
    public void testGetEnrolledStudents()
    {
        Assert.assertTrue(testCourse.getEnrolledStudents() instanceof ArrayList);
    }

    @Test
    public void testGetModules()
    {
        Assert.assertTrue(testCourse.getModules() instanceof ArrayList);
    }

}

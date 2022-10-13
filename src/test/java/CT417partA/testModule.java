package CT417partA;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;
import org.junit.Assert.*;
public class testModule {

    private Module module;

    public testModule()
    {
        module=new Module(5001,"Python 101",new Lecturer("Dr. Doom",52,"19/01/1970",1345));
    }


    @Test
    public void testGetModuleCode()
    {
        Assert.assertEquals(5001,module.getModuleCode());
    }


    @Test
    public void testGetModuleName()
    {
        Assert.assertEquals("Python 101",module.getModuleName());
    }

    @Test
    public void testGetRegisteredStudents()
    {

        Assert.assertTrue(module.getRegisteredStudents() instanceof ArrayList);
    }

    @Test
    public void testGetTaughtBy()
    {
        Lecturer lecturer= new Lecturer("Dr. Doom",52,"19/01/1970",1345);

        Assert.assertTrue(module.getTaughtBy() instanceof Lecturer);
    }


}


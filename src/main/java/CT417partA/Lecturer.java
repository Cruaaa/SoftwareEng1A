package CT417partA;

import java.util.ArrayList;

public class Lecturer {



    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;

    //Arraylist used
    private ArrayList<Module> teaching;



    //Constructor
    public Lecturer(String name, int age, String DOB, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.username = getUsername();

        teaching = new ArrayList<Module>();
    }



    //getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public ArrayList getModules() {
        return teaching;
    }

    public String getUsername() {

        return (name+String.valueOf(age));
    }

    //setter methods


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void addModule(Module module)
    {
        teaching.add(module);

    }
}

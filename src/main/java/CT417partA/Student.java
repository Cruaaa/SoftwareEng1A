package CT417partA;

import java.util.ArrayList;

public class Student {


    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private ArrayList<Course_Programme> courses;
    private ArrayList<Module> modules;



    //Constructor
    public Student(String name, int age, String DOB, int ID) {
        //Standard Variables
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.username = getUsername();

        //Arraylists used
        modules = new ArrayList<Module>();
        courses = new ArrayList<Course_Programme>();
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

    public String getUsername() {

        return (name+String.valueOf(age));
    }

    public ArrayList getCourses() {
        return courses;
    }

    public ArrayList getModules() {
        return modules;
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

    //mutator methods
    public void addModule(Module module)
    {
        modules.add(module);
    }

    public void addCourseProgramme(Course_Programme program)
    {
        courses.add(program);
    }
}

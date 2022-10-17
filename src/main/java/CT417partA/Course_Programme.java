package CT417partA;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course_Programme {

    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime CourseStartDate;
    private DateTime CourseEndDate;

    //Constructor
    public Course_Programme(String courseName, DateTime CourseStartDate,DateTime CourseEndDate,ArrayList<Module> moduleList,ArrayList<Student> arrayList )
    {
        //Standard Variables
        this.courseName=courseName;
        this.CourseStartDate=new DateTime(2022,9,3,8,0);
        this.CourseEndDate=new DateTime(2026,4,30,11, 59);

        //Arraylists used
        modules= new ArrayList<Module>();
        students= new ArrayList<Student>();;
    }

    public String getCourseName() {
        return courseName;
    }

    public DateTime getStartDate() {
        return CourseStartDate;
    }

    public DateTime getEndDate() {
        return CourseEndDate;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void students(ArrayList<Student> students) {
        this.students = students;
    }

    public void addEnrolledStudent(Student s) {
        students.add(s);
    }



    public void setStartDate(DateTime startDate) {
        this.CourseStartDate = startDate;
    }



    public void setEndDate(DateTime endDate) {
        this.CourseEndDate = endDate;
    }

    @Override
    public String toString() {
        String returnString="\n\n-----------Course:---------------------\n\n";

        returnString+="Course Name: "+this.courseName+"\n"+"Start Date: "+CourseStartDate+"\nEnd Date: "+CourseEndDate;

        returnString+="\n\nModules in this course: ";

        for(Module m: modules)
        {
            returnString+=m.getModuleName();
            returnString+="\nLecturer responsible: "+m.getTaughtBy().getName();
            returnString+="\n\n";
        }

        returnString+="------------End of this CourseProgramme record------------\n\n";
        return returnString;

    }
}
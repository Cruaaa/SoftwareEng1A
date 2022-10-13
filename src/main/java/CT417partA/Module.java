package CT417partA;

import java.util.ArrayList;

    public class Module {

        private int moduleCode;
        private String name;
        private Lecturer taughtBy;
        private ArrayList<Student> registeredStudents;
        private ArrayList<Course_Programme> coursesPartOf;

        //Constructor
        public Module(int moduleCode, String name, Lecturer taughtBy) {
            //standard variables
            this.moduleCode = moduleCode;
            this.name = name;
            this.taughtBy = taughtBy;


            //Arraylists used
            registeredStudents = new ArrayList<Student>();
            coursesPartOf = new ArrayList<Course_Programme>();

        }

        //getter methods
        public int getModuleCode() {
            return moduleCode;
        }

        public String getModuleName() {
            return name;
        }

        public Lecturer getTaughtBy() {
            return taughtBy;
        }

        public ArrayList<Student> getRegisteredStudents() {
            return registeredStudents;
        }

        public ArrayList<Course_Programme> getcoursesPartOf() {
            return coursesPartOf;
        }

        //Setter methods
        public void setModuleCode(int moduleCode) {
            this.moduleCode = moduleCode;
        }

        public void setModuleName(String name) {
            this.name = name;
        }

        public void setTaughtBy(Lecturer taughtBy) {
            this.taughtBy = taughtBy;
        }

        //Mutator methods
        public void addcoursesPartOf(Course_Programme courseProgramme) {
            coursesPartOf.add(courseProgramme);
        }

        public void addRegisteredStudent(Student student) {
            registeredStudents.add(student);
        }

    }




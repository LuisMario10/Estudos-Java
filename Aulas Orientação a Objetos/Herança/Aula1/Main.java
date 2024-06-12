import StudentClass.Student;
import TeacherClass.Teacher;

public class Main {
    public static void main(String[] args) {
        Student eu = new Student("Luis", 18);
        Teacher professor = new Teacher("Prof", 49, 6329.2f);
        eu.status();
        professor.status();
    }
}

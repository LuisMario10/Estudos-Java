import ScholarshipStudentClass.ScholarshipStudent;
import StudentClass.Student;

public class Main {
    public static void main(String[] args) {
        Student fulano = new Student("Fulano", 19, 'M', "ADS", 5234.43f);
        ScholarshipStudent ciclana = new ScholarshipStudent("Ciclana", 23, 'F', "Odonto", 7242.4f, 48.3f);
        fulano.status();
        ciclana.status();
    }
}
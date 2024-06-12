package ScholarshipStudentClass;

import StudentClass.Student;

public class ScholarshipStudent extends Student {
    private float discount;

    public ScholarshipStudent(String name, int age, char sex, String course, float priceCourse, float discount) {
        super(name, age, sex, course, priceCourse);
        this.setDiscount(discount);
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }

    public void renewDiscount(float newDiscount) {
        this.discount = newDiscount;
    }

    @Override
    public void payCourse() {
        float payValue = (this.discount / 100) * this.getPriceCourse();
        System.out.println("O aluno " + this.getName() + "e bolsista!" + "pagou o valor de R$ " + payValue);
    }

    @Override
    public void status() {
        System.out.println("==== Status da Pessoa ====");
        System.out.println("Nome: " + this.getName());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("Porcentagem da bolsa: " + this.getDiscount());
        System.out.println("Matricula: " + this.getRegistration());
        System.out.println("Curso: " + this.getCourse());
        System.out.println("==========================");
    }
}

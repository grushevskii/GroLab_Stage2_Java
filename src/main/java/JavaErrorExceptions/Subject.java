package JavaErrorExceptions;


public class Subject {
    private String subject;
    private Integer grade;

    public Subject(String subject, Integer grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {return subject;}
    public void setSubject() {
       this.subject=subject;
    }
    public Integer getGrade() {return grade;}
    public void setGrade(Integer grade) {this.grade = grade;}

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer(" ");
        buffer.append("Предмет: ").append(subject);
        buffer.append(", Оценка: ").append(grade);
        return buffer.toString();
    }

}

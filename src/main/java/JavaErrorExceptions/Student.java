package JavaErrorExceptions;

import java.util.LinkedList;

public  class Student  {
    private String firstName;
    private String surName;
    private String middleName;
    private Faculty faculty;
    private LinkedList<Subject> subjectGrade;
    public static LinkedList<Student> studentsList = new LinkedList<>();

    public Student(String firstName, String surName, String middleName, Faculty faculty) {
        this.firstName = firstName;
        this.surName = surName;
        this.middleName = middleName;
        this.faculty = faculty;
        this.subjectGrade  = new LinkedList<>();
        studentsList.add(this);
    }

    public Faculty getFaculty() {return faculty;}
    public void setFaculties(Faculty faculties) {
       this.faculty=faculty;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getMiddleName() {return middleName;}
    public void setMiddleName(String middleName) {this.middleName = middleName;}
    public String getSurName() {return surName;}
    public void setSurName(String surName) {this.surName = surName;}
    public LinkedList<Subject> getSubjectGrade() {
        if (subjectGrade.toString().isEmpty()) {
            throw new NullPointerException("Argument is empty!");
        }
        return subjectGrade; }

    public void setSubjectGrade(LinkedList<Subject> subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public  void addSubjectGrade(Subject subject) {
        if (subject.getGrade()<0 && subject.getGrade()>10) {
            throw new IllegalArgumentException("Grade format isn't correct!"); }
        subjectGrade.add(subject);
    }

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer( "Студент {");
        buffer.append(" Фамилия: ").append(firstName);
        buffer.append(", Имя: ").append(surName);
        buffer.append(", Отчество: ").append(middleName);
        buffer.append(", ").append(faculty);
        buffer.append(", ").append(subjectGrade);
        buffer.append('}');
        return buffer.toString();
    }
}


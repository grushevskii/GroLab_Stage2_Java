package JavaErrorExceptions;

import static JavaErrorExceptions.ManagerSystem.*;
import static JavaErrorExceptions.PrintFaculties.allFacultyList;

public class UniversityProgram {
    public static void main(String[] args) {
        Student student1=new Student("Иванов", "Иван", "Иванович",
                new Faculty("Филологический","F-123"));
        student1.addSubjectGrade(new Subject("Языкознание",6));
        student1.addSubjectGrade(new Subject("Лингвистика",7));
        student1.addSubjectGrade(new Subject("Риторика",5));
        Student student2=new Student("Петров", "Петр", "Петрович",
                new Faculty("Педагогический",  "P-121") );
        student2.addSubjectGrade(new Subject("Педагогика",8));
        student2.addSubjectGrade(new Subject("Психология",6));
        student2.addSubjectGrade(new Subject("Этика",9));
        Student student3=new Student("Шувалов", "Ян", "Романович",
                new Faculty("Юридический", "L-231") );
        student3.addSubjectGrade(new Subject("Права человека",7));
        student3.addSubjectGrade(new Subject("Международное право",4));
        student3.addSubjectGrade(new Subject("Налоговое право",7));
        Student student4=new Student("Селезнев", "Сергей", "Сергеевич",
                new Faculty("Экономический", "E-122") );
        student4.addSubjectGrade(new Subject("Микроэкономика",6));
        student4.addSubjectGrade(new Subject("Макроэкономика",5));
        student4.addSubjectGrade(new Subject("Менеджмент",8));
        Student student5=new Student("Еремич", "Виталий", "Сергеевич",
                new Faculty("Экономический", "E-121") );
        student5.addSubjectGrade(new Subject("Микроэкономика",7));
        student5.addSubjectGrade(new Subject("Макроэкономика",6));
        student5.addSubjectGrade(new Subject("Менеджмент",9));
        Student student6=new Student("Филипенко", "Юрий", "Петрович",
                new Faculty("Филологический",  "F-121") );
        student6.addSubjectGrade(new Subject("Языкознание",5));
        student6.addSubjectGrade(new Subject("Лингвистика",8));
        student6.addSubjectGrade(new Subject("Риторика",6));
        Student student7=new Student("Полуян", "Петр", "Викторович",
                new Faculty("Юридический", "L-231") );
        student7.addSubjectGrade(new Subject("Права человека",8));
        student7.addSubjectGrade(new Subject("Международное право",8));
        student7.addSubjectGrade(new Subject("Налоговое право",9));
        Student student8=new Student("Бирюков", "Евгений", "Александрович",
                new Faculty("Педагогический",  "P-123") );
        student8.addSubjectGrade(new Subject("Педагогика",7));
        student8.addSubjectGrade(new Subject("Психология",5));
        student8.addSubjectGrade(new Subject("Этика",8));
        Student student9=new Student("Крайник", "Александр", "Валентинович",
                new Faculty("Юридический",  "L-221") );
        student9.addSubjectGrade(new Subject("Права человека",6));
        student9.addSubjectGrade(new Subject("Международное право",4));
        student9.addSubjectGrade(new Subject("Налоговое право",5));
        Student student10=new Student("Бортник", "Виктор", "Семенович",
                new Faculty( "Юридический",  "L-231"));
        student10.addSubjectGrade(new Subject("Права человека",7));
        student10.addSubjectGrade(new Subject("Международное право",9));
        student10.addSubjectGrade(new Subject("Налоговое право",6));
        Student student11=new Student("Емельянович", "Сергей", "Николаевич",
                new Faculty("Филологический", "F-123"));
        student11.addSubjectGrade(new Subject("Языкознание",6));
        student11.addSubjectGrade(new Subject("Лингвистика",7));
        student11.addSubjectGrade(new Subject("Риторика",6));
        Student student12=new Student("Сидорченко", "Андрей", "Петрович",
                new Faculty("Экономический",  "E-121") );
        student12.addSubjectGrade(new Subject("Микроэкономика",8));
        student12.addSubjectGrade(new Subject("Макроэкономика",9));
        student12.addSubjectGrade(new Subject("Менеджмент",8));
        Student student13=new Student("Карпиков", "Богдан", "Сергеевич",
                new Faculty("Филологический",  "F-131") );
        student13.addSubjectGrade(new Subject("Языкознание",7));
        student13.addSubjectGrade(new Subject("Лингвистика",7));
        student13.addSubjectGrade(new Subject("Риторика",8));

        allFacultyList();
        avgAllSubjectsStudent("Иванов");
        avgSubject("Лингвистика");
        avgSubjectGroupFaculty("Международное право","L-231","Юридический");


    }
}

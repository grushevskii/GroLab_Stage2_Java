package JavaErrorExceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static  JavaErrorExceptions.Student.studentsList;

public class ManagerSystem extends PrintFaculties {

    public static void avgAllSubjectsStudent(String lastName) {
        System.out.println("Средний балл по всем предметам студента по фамилии <" + lastName + ">:");
        double result=0;
        BigDecimal avg;
        for (Student student : studentsList) {
            if (student.getFirstName().equals(lastName)) {
                for (Subject entry : student.getSubjectGrade()) {
                    result += entry.getGrade();
                }
                result=result/student.getSubjectGrade().size();
            }
        }
        avg=new BigDecimal(result);
        System.out.println(avg.setScale(2, RoundingMode.HALF_EVEN));
    }

    public static void avgSubject(String subject) {
        System.out.println("Средний балл по предмету <" + subject + "> для всего университета:");
        BigDecimal avg;
        double result = 0;
        int size = 0;
        for (Student student : studentsList) {
            for (Subject entry : student.getSubjectGrade()) {
                if (entry.getSubject().equals(subject)) {
                    result += entry.getGrade();
                    size++;
                }
            }
        }
        result=result/size;
        avg=new BigDecimal(result);
        System.out.println(avg.setScale(2, RoundingMode.HALF_EVEN));
    }

    public static void avgSubjectGroupFaculty(String subject,String group,String faculty) {
        System.out.println("Средний балл по предмету <" + subject + "> в группе <"+group+"> на факультете <"+faculty+">:");
        BigDecimal avg;
        double result = 0;
        int size = 0;
        for (Student student : studentsList) {
            if (student.getFaculty().getGroup().equals(group) && student.getFaculty().getFaculty().equals(faculty)) {
                for (Subject entry : student.getSubjectGrade()) {
                    if (entry.getSubject().equals(subject)) {
                        result += entry.getGrade();
                        size++;
                    }
                }
            }
        }
        result=result/size;
        avg=new BigDecimal(result);
        System.out.println(avg.setScale(2, RoundingMode.HALF_EVEN));
    }

}

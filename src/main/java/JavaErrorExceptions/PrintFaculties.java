package JavaErrorExceptions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static JavaErrorExceptions.Student.studentsList;

public class PrintFaculties {
    public static List<Student> facultyList=new LinkedList<>();
    public static List<Student> groupList=new LinkedList<>();

    public static void allFacultyList() {
        HashSet<String> nameFaculties=new HashSet<>();
        for (Student student : studentsList) {nameFaculties.add(student.getFaculty().getFaculty()); }
        if (nameFaculties == null) throw new NullPointerException("There are no faculties at the university!");
        else {
            for (String faculty : nameFaculties) {
                System.out.println("Список студентов факультета <" + faculty + ">:");
                for (Student student : studentsList) {
                    if (student.getFaculty().getFaculty().equals(faculty)) {
                        System.out.println(student);
                        facultyList.add(student);
                    }
                }
                groupsList(facultyList);
            }
        }
    }

    public static void groupsList(List<Student> facultyList) {
        HashSet<String> nameGroups=new HashSet<>();
        for (Student faculty : facultyList) {nameGroups.add(faculty.getFaculty().getGroup()); }
        if (nameGroups == null) throw new NullPointerException("There are no groups at the faculty!");
        else {
            for (String group : nameGroups) {
                for (Student student : facultyList) {
                    if (student.getFaculty().getGroup().equals(group)) {
                        groupList.add(student);
                    }
                }
                if(groupList.isEmpty()) throw new NullPointerException("There are no students in the group!");
            }
        }
    }
}

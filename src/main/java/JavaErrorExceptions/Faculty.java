package JavaErrorExceptions;

public class Faculty {
    private String group;
    private  String faculty;

    public Faculty(String faculty, String group) {
        this.group = group;
        this.faculty = faculty;
    }

    public String getGroup() {return group;}
    public void setGroup(String group) {this.group = group;}
    public  String getFaculty() {return faculty;}
    public void setFaculty(String faculty) {this.faculty = faculty;}

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer(" ");
        buffer.append("Факультет: ").append(faculty);
        buffer.append(", Группа: ").append(group);
        return buffer.toString();
    }
}

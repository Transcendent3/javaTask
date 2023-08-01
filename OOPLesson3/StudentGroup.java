package OOPLesson3;

import java.util.List;

public class StudentGroup {
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }
}
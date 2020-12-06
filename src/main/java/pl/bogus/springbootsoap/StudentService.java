package pl.bogus.springbootsoap;

import org.springframework.stereotype.Service;
import pl.bogus.springbootsoap.model.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @PostConstruct
    private void loadExample() {
        Student students = new Student();

        Student student2 = new Student();

        this.students.add(student2);
        this.students.add(students);

    }

    public Student getStudentByIndex(long index) {
        return (students.stream()
                .filter(student -> student.getIndex() == index)
                .findFirst())
                .orElseThrow(NoSuchElementException::new);
    }


}

package pl.bogus.springbootsoap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pl.bogus.springbootsoap.model.GetResponse;
import pl.bogus.springbootsoap.model.GetStudent;
import pl.bogus.springbootsoap.model.Student;

@Endpoint
public class StudentEndpoint {

    private final StudentService studentService;

    public StudentEndpoint(StudentService studentService) {
        this.studentService = studentService;
    }

    @PayloadRoot(namespace = "http://bogus.pl/soap", localPart = "getStudent")
    @ResponsePayload
    public GetResponse getStudentById(@RequestPayload GetStudent getStudent) {

        Student studentByIndex = studentService.getStudentByIndex(getStudent.getIndex());
        GetResponse getResponse = new GetResponse();
        getResponse.setStudent(studentByIndex);
        return getResponse;

    }
}

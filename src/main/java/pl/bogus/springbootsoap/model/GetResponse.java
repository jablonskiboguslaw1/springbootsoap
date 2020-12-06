package pl.bogus.springbootsoap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "student"
})
@XmlRootElement(name = "getResponse", namespace = "http://bogus.pl/soap")
public class GetResponse {

    @XmlElement(required = true)
    private Student student;



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}

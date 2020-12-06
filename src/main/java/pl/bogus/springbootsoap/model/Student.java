package pl.bogus.springbootsoap.model;

public class Student {


    private long index;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }



    public long getIndex() {
        return 0;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

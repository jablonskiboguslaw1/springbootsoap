package pl.bogus.springbootsoap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"index"})

@XmlRootElement(name = "getStudent", namespace = "http://bogus.pl/soap")
public class GetStudent {

    private long index;

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }
}

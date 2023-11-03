package com.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("emp")
public class Employee {
    @Value("coder")
    private String name;
    @Value("1")
    private  int id;

    @Value(("#{ad}"))
    private List<String> addrss;

    public List<String> getAddrss() {
        return addrss;
    }

    public void setAddrss(List<String> addrss) {
        this.addrss = addrss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", addrss=" + addrss +
                '}';
    }
}

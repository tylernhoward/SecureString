package edu.towson.insure;

public class TestObj {

    @Override
    public String toString() {
        return "TestObj{" +
                "ssn=" + ssn +
                ", name='" + name + '\'' +
                '}';
    }

    public TestObj(int ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    private int ssn;
    private String name;
}
